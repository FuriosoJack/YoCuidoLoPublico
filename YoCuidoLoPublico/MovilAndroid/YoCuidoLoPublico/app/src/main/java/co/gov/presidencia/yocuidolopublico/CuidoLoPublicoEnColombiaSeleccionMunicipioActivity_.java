//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package co.gov.presidencia.yocuidolopublico;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import co.gov.mintic.util.ProgressDialogManager_;
import co.gov.presidencia.yocuidolopublico.service.client.CuidoLoPublicoClient_;
import co.gov.presidencia.yocuidolopublico.service.client.dto.MunicipioMapaDTO;
import co.gov.presidencia.yocuidolopublico.R.id;
import co.gov.presidencia.yocuidolopublico.R.layout;
import com.googlecode.androidannotations.api.BackgroundExecutor;

public final class CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_
    extends CuidoLoPublicoEnColombiaSeleccionMunicipioActivity
{

    private Handler handler_ = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_reportes_municipio);
    }

    private void init_(Bundle savedInstanceState) {
        reportesClient = new CuidoLoPublicoClient_();
        dialog = ProgressDialogManager_.getInstance_(this);
    }

    private void afterSetContentView_() {
        title = ((TextView) findViewById(id.title));
        spinnerDeptos = ((Spinner) findViewById(id.spinnerDeptos));
        spinnerMunicipios = ((Spinner) findViewById(id.spinnerMunicipios));
        {
            View view = findViewById(id.btnVerEnMapa);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_.this.btnVerEnMapa();
                    }

                }
                );
            }
        }
        ((ProgressDialogManager_) dialog).afterSetContentView_();
        init();
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

    public static CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_.IntentBuilder_ intent(Context context) {
        return new CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_.IntentBuilder_(context);
    }

    @Override
    public void loadLista_municipios(final MunicipioMapaDTO[] muniServicio) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_.super.loadLista_municipios(muniServicio);
                } catch (RuntimeException e) {
                    Log.e("CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void loadLista_deptos(final String[] codigos) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                try {
                    CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_.super.loadLista_deptos(codigos);
                } catch (RuntimeException e) {
                    Log.e("CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_", "A runtime exception was thrown while executing code in a runnable", e);
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
                    CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_.super.showServerError();
                } catch (RuntimeException e) {
                    Log.e("CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_", "A runtime exception was thrown while executing code in a runnable", e);
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
                    CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_.super.showConnectionError();
                } catch (RuntimeException e) {
                    Log.e("CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void obtenerDepartamentos(final String idRegion) {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_.super.obtenerDepartamentos(idRegion);
                } catch (RuntimeException e) {
                    Log.e("CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_", "A runtime exception was thrown while executing code in a runnable", e);
                }
            }

        }
        );
    }

    @Override
    public void obtenerMunicipios(final String idDepartamento) {
        BackgroundExecutor.execute(new Runnable() {


            @Override
            public void run() {
                try {
                    CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_.super.obtenerMunicipios(idDepartamento);
                } catch (RuntimeException e) {
                    Log.e("CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_", "A runtime exception was thrown while executing code in a runnable", e);
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
            intent_ = new Intent(context, CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public CuidoLoPublicoEnColombiaSeleccionMunicipioActivity_.IntentBuilder_ flags(int flags) {
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