package FunctionsDevice.Safari;

public class Safari implements ShowPage, AddPage, RefreshPage{
    @Override
    public void addPage() {
        System.out.println("Pagina adicionada!");
    }

    @Override
    public void showPage() {
        System.out.println("Showing page");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refresh the window");
    }
}
