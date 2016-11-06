package br.com.kssioalmeida.requeryplaground;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import br.com.kssioalmeida.requeryplaground.domain.entity.Contact;
import br.com.kssioalmeida.requeryplaground.repository.ContactRepository;
import br.com.kssioalmeida.requeryplaground.ui.BaseActivity;

public class MainActivity extends BaseActivity {

    ViewHolder holder;

    @Inject
    ContactRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        holder = new ViewHolder(this);

        holder.btnSave.setOnClickListener(v -> {
            Contact contact = new Contact();
            contact.setName(holder.textName.getText().toString());
            contact.setLastName(holder.textLastName.getText().toString());
            contact.setAge(Integer.parseInt(holder.textAge.getText().toString()));
            contact.setPhone(holder.textPhone.getText().toString());
            contact.setMail(holder.textMail.getText().toString());

            repository.insert(contact);

            Toast.makeText(MainActivity.this, holder.textName.getText(), Toast.LENGTH_LONG).show();
        });

    }

    protected class ViewHolder {

        TextView textName;
        TextView textLastName;
        TextView textAge;
        TextView textPhone;
        TextView textMail;
        Button btnSave;

        ViewHolder(Activity view) {
            this.textName = (TextView) view.findViewById(R.id.name);
            this.textLastName = (TextView) view.findViewById(R.id.last_name);
            this.textAge = (TextView) view.findViewById(R.id.age);
            this.textPhone = (TextView) view.findViewById(R.id.phone);
            this.textMail = (TextView) view.findViewById(R.id.mail);
            this.btnSave = (Button) view.findViewById(R.id.button_save);

        }
    }
}
