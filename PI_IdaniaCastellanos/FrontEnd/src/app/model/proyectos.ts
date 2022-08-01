export class Proyectos {
    id?: number;
    nombreP: string;
    descripcionP: string;
    imageP: string;

    constructor(nombreP: string, descripcionP: string, imageP: string){
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imageP = imageP;
    }
}
