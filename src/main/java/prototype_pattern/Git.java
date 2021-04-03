package prototype_pattern;


import java.util.HashMap;
import java.util.Map;

public class Git {
    private Branch current;
    private final Map<String, Branch> branches;

    public Git() {
        Branch master = new Branch();
        current = master;

        branches = new HashMap<>();
        branches.put("master", master);
    }

    public Branch checkout(String branchName) throws CloneNotSupportedException {
        Branch branchToCheckout = branches.get(branchName);
        
        if(branchToCheckout == null) {
            branchToCheckout = (Branch) current.clone();
            branches.put(branchName, branchToCheckout);
        }

        current = branchToCheckout;
        return branchToCheckout;
    }

    public Branch getCurrent() {
        return current;
    }

    public void listAllBranches() {
        System.out.println("\n========= BRANCHES =========");
        branches.forEach((name, branch) -> {
            System.out.println("> [" + name + "]");
        });
        System.out.println("============================\n");
    }
}
