﻿//------------------------------------------------------------------------------
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
    using System.Data.Entity;
    using System.Data.Entity.Infrastructure;
    
    public partial class AuditoriaEntities : DbContext
    {
        public AuditoriaEntities()
            : base("name=AuditoriaEntities")
        {
        }
    
        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
           // throw new UnintentionalCodeFirstException();
        }
    
        public DbSet<stra_acciones> stra_acciones { get; set; }
        public DbSet<stra_auditoria> stra_auditoria { get; set; }
        public DbSet<stra_tipos> stra_tipos { get; set; }
    }
}