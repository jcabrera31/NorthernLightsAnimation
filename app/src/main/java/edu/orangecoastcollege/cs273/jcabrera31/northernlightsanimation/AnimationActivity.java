package edu.orangecoastcollege.cs273.jcabrera31.northernlightsanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {

    private AnimationDrawable frameAnim;
    private Animation rotateAnim;
    private Animation shakeAnim;
    private Animation customAnim;

    private ImageView lightsImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        lightsImageView = (ImageView) findViewById(R.id.lightsImageView);

    }

    /**
     *
     * @param view
     */
    public void toggleFrameAnim(View view)
    {
         if (frameAnim == null) {
             lightsImageView.setBackgroundResource(R.drawable.frame_anim);
             frameAnim = (AnimationDrawable) lightsImageView.getBackground();
        }

        if(frameAnim.isRunning())
        {
            frameAnim.stop();
        }
        else
        {
            frameAnim.start();
        }
    }


    /**
     *
     * @param view
     */

    public void toggleRotateAnim(View view)
    {
        if(frameAnim !=null && frameAnim.isRunning())
        {
            frameAnim.stop();
        }

        if( rotateAnim != null && rotateAnim.hasStarted())
        {
            lightsImageView.clearAnimation();
            rotateAnim=null;
        }
        else
        {
            rotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
            lightsImageView.startAnimation(rotateAnim);
        }

    }

    /**
     *
     * @param view
     */
    public void toggleShakeAnim (View view)
    {
        if(frameAnim !=null && frameAnim.isRunning())
        {
            frameAnim.stop();
        }

        if( rotateAnim != null && rotateAnim.hasStarted())
        {
            lightsImageView.clearAnimation();
            rotateAnim=null;
        }

        if( shakeAnim != null && shakeAnim.hasStarted())
        {
            lightsImageView.clearAnimation();
            shakeAnim=null;
        }
        else
        {
            shakeAnim = AnimationUtils.loadAnimation(this, R.anim.shake_anim);
            lightsImageView.startAnimation(shakeAnim);
        }
    }

    public void toggleCustomAnim (View view)
    {
        if(frameAnim !=null && frameAnim.isRunning())
        {
            frameAnim.stop();
        }

        if( rotateAnim != null && rotateAnim.hasStarted())
        {
            lightsImageView.clearAnimation();
            rotateAnim=null;
        }

        if( customAnim != null && customAnim.hasStarted())
        {
            lightsImageView.clearAnimation();
            customAnim=null;
        }
        else
        {
            customAnim = AnimationUtils.loadAnimation(this, R.anim.custom_anim);
            lightsImageView.startAnimation(customAnim);
        }
    }


}
