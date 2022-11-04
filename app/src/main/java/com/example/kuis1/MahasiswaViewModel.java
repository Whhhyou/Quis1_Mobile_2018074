package com.example.kuis1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MahasiswaViewModel extends ViewModel {
    private MutableLiveData<String> Nama;
    private MutableLiveData<String> nim;
    private MutableLiveData<String> angkatan;

    public MutableLiveData<String> getNama() {
        if(Nama == null){
            Nama = new MutableLiveData<>();
        }
        return Nama;
    }
    public MutableLiveData<String> getNim() {
        if(nim == null){
            nim = new MutableLiveData<>();
        }
        return nim;
    }
    public MutableLiveData<String> getAngkatan() {
        if(angkatan == null){
            angkatan = new MutableLiveData<>();
        }
        return angkatan;
    }

    public void setNama(String nama) {this.Nama.postValue(nama);}
    public void setNim(String nim) {this.nim.postValue(nim);}
    public void setAngkatan(String angkatan) {this.angkatan.postValue(angkatan);}
}
