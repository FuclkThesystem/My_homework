import groovy.json.JsonBuilder
// Создание JSON объекта
def json = new JsonBuilder()
json.person {
    username "Guillaume"
    age 33
    pets "Hector", "Felix"
}

println json.toString() // вывод в строку полученного объекта

def x
x=5
println (x)

def Map confJob
confJob = [map: "World Map", pinky: "realy /? pink slow"]
println (confJob.pinky)
