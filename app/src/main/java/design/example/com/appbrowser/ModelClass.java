package design.example.com.appbrowser;

enum ModelObject {

    RED(R.layout.scatch_card),
    BLUE(R.layout.scratch_card2),
    GREEN(R.layout.scratch_card3);

    private int mLayoutResId;

    ModelObject(int layoutResId) {
        mLayoutResId = layoutResId;
    }


    public int getLayoutResId() {
        return mLayoutResId;
    }

}