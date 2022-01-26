package gof.designpatterns._05_prototype._01_before;

public class App {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteShip");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제");

        String url = githubIssue.getUrl();
        System.out.println("url = " + url);

        // TODO clone != githubIssue
        // TODO clone.equals(githubIssue) => true
    }
}
