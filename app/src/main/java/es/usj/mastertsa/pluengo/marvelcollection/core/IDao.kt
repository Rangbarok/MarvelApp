package es.usj.mastertsa.pluengo.marvelcollection.core

interface IDao<T> {

    fun insert(element: T) : T
    fun update(element: T) : Int?
    fun delete(id: Int) : T?
    fun list() : List<T>
    fun findById(id: Int) : T?

}