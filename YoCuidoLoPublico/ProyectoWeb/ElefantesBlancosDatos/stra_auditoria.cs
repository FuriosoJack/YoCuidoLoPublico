//------------------------------------------------------------------------------
// <auto-generated>
//    This code was generated from a template.
//
//    Manual changes to this file may cause unexpected behavior in your application.
//    Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace ElefantesBlancosDatos
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;

    public partial class stra_auditoria
    {
        [Key]
        public int id_stra_auditoria { get; set; }
        public int id_stra_accion { get; set; }
        public int id_stra_elefante { get; set; }
        public int id_stra_usuario { get; set; }
        public int id_stra_tipo { get; set; }
        public string datos { get; set; }
        public System.DateTime fecha_creacion { get; set; }
        public string usuario { get; set; }
        public string titulo { get; set; }
    
        //public virtual stra_acciones stra_acciones { get; set; }
        //public virtual stra_tipos stra_tipos { get; set; }
    }
}