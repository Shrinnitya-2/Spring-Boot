• @Entity:-it is a class level annotations, it can be used to declare a class as an Entity class.
• @Table(name=”tablename”):-it is a class level annotation, it is used to configuretable name for the entity class. 
                          Where “name” attribute is used to provide table name. And also used to map our class with db table name.
• @Id:-it is filed level annotation . it is used to declare a property as a ID. And it
        represent the field mapped with primary column in table.
• @column(name=”columnname”):- it is used to provide database table column name.what ever name you provide it will create column with that name and
                                map with it. Note:- if in database table name and our entity class name is same then
• @Table is optional. Note:- if database column name and entity class field name is same then
• @Column is optional.
• @OneToOne:-used to define one-to-one mapping between two entity beans.
• @OneToMany:-used to define one – to – many unidirectional entity mapping.
• @ManyToMany:-it represent many –to-many relationship between two entites. It is typically used to map a collection of child entites to a collection of
              parent entites.
