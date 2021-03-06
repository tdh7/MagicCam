package nahuy.fithcmus.magiccam.presentation.commanders.impl.crop;

import com.isseiaoki.simplecropview.CropImageView;

import nahuy.fithcmus.magiccam.presentation.commanders.callbacks.CallingAbstractCommander;

/**
 * Created by huy on 6/1/2017.
 */

public class Crop4_3Commander implements CallingAbstractCommander {
    @Override
    public void process(Object obj) {
        if(obj instanceof CropImageView){
            CropImageView cropImageView = (CropImageView)obj;
            cropImageView.setCropMode(CropImageView.CropMode.RATIO_4_3);
        }
    }
}
