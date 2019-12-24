public class CheckArguments {
    public static void main(String[] args) {
        ArgumentsHolder holder = new ArgumentsHolder(args);
        if (!holder.hasArguments()) {
            printError("No Arguments!");
        }
    }
    private static void printError(String message) {
        System.out.println(message);
    }

    private static class ArgumentsHolder {
        private final String[] args;

        private ArgumentsHolder(String[] args) {
            this.args = args;
        }

        public boolean hasArguments() {
            return args.length != 0;
        }
    }
}

