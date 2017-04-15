package ca.tash.catalogueapp.ui;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import ca.tash.catalogueapp.R;
import ca.tash.catalogueapp.provider.PhotoProvider;
import ca.tash.catalogueapp.store.Bag;

/**
 * Created by dounaka on 2017-04-13.
 * very simple fragment
 */

public class BagWishlistView extends EntityView<Bag> {
    private ImageView mImgBag;
    private TextView mtxtBagName;

    public BagWishlistView(Context ctx) {
        super(ctx);
    }


    @Override
    protected void showEntity(Bag bag) {
        if (bag == null)
            mtxtBagName.setText(R.string.error_notfound_data);
        else {
            mtxtBagName.setText(bag.name);
            mImgBag.setImageResource(PhotoProvider.getPhotoRes(bag.photoId));
        }
    }

    @Override
    public int getViewResourceId() {
        return R.layout.view_bag_thumbnail;
    }

    @Override
    public void bindControls(Context ctx) {
        mImgBag = (ImageView) findViewById(R.id.imgBag);
        mtxtBagName = (TextView) findViewById(R.id.txtBagName);
    }

    public ImageView getBagImageView() {
        return this.mImgBag;
    }
}
