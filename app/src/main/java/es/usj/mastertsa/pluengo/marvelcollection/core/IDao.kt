package es.usj.mastertsa.pluengo.marvelcollection.core

interface IDao<T> {

    fun insert(element: T) : T
    fun update(element: T) : Long?
    fun delete(id: Long) : T?
    fun list() : List<T>
    fun findById(id: Long) : T?

}