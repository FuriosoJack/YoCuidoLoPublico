//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package co.gov.presidencia.yocuidolopublico;

import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import co.gov.mintic.util.dto.MyLocalReportDTO;
import co.gov.presidencia.yocuidolopublico.service.client.CuidoLoPublicoClient_;
import co.gov.presidencia.yocuidolopublico.service.client.dto.DetalleBasicoCuidoLoPublicoDTO;
import co.gov.presidencia.yocuidolopublico.R.id;
import co.gov.presidencia.yocuidolopublico.R.layout;
import com.googlecode.androidannotations.api.BackgroundExecutor;

public final class MisReportesActivity_
    extends MisReportesActivity
{

    private Handler handler_ = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_mis_reportes);
    }

    private void init_(Bundle savedInstanceState) {
        reportesClient = new CuidoLoPublicoClient_();
    }

    private void afterSetContentView_() {
        misReportes = ((ListView) findViewById(id.misReportes));
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        afterSetContentView_();
    }

    public static MisReportesActivity_.IntentBuilder_ intent(Context context) {
        return new MisReportesActivity_.IntentBuilder_(context);
    }

    @Override
    public void mostrarResultado(final DetalleBasicoCuidoLoPublicoDTO reporte) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    MisReportesActivity_.super.mostrarResultado(reporte);
                } catch (RuntimeException e) {
                    Log.e("MisReportesActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void showServerError() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    MisReportesActivity_.super.showServerError();
                } catch (RuntimeException e) {
                    Log.e("MisReportesActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void showConnectionError() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    MisReportesActivity_.super.showConnectionError();
                } catch (RuntimeException e) {
                    Log.e("MisReportesActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void obtenerReporte(final List<MyLocalReportDTO> misReportes) {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    MisReportesActivity_.super.obtenerReporte(misReportes);
                } catch (RuntimeException e) {
                    Log.e("MisReportesActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, MisReportesActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public MisReportesActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (context_ instanceof Activity) {
                ((Activity) context_).startActivityForResult(intent_, requestCode);
            } else {
                context_.startActivity(intent_);
            }
        }

    }

}
