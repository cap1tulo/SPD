package task1;

public class BalanceCheckHandler extends Handler {
    @Override
    public void handleRequest(ClientRequest request) {
        if (request.hasSufficientBalance()) {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("Request rejected: Insufficient balance.");
        }
    }
}
