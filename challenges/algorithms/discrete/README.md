## Задача на алгоритмы с графами.
Иходные данные:
Var: <Номер варианта> vb ---> vt
Список ребер ПРОСТОГО графа и их веса в виде:
w({vi, vj}) = W
Означает, что ребро из вершин vi и vj имеет вес W.
Веса — целые неотрицательные числа с обычными операциями сложения и сравнения.
Число вершин равно максимальному номеру вершины в списке.
Других ребер, кроме упомянутых в списке, нет.
Необходимо:
(1) По алгоритму Флойда-Уоршалла найти матрицу весов маршрутов И матрицу номеров
первых вершин этих маршрутов. Обратите внимание, граф простой, поэтому каждое
ребро «проходимо» в любом направлении. То есть, если указано, например,
w({v2, v5}) = 12,
то возможен как маршрут через вершины 2 и 5, так и в обратном направлении через
5 и 2. В обоих случаях вес ребра равен 12. Поэтому матрица весов симметричная.
(2) Для указанной пары вершин vb ---> vt извлечь из матрицы маршрутов маршрут от
вершины vb к вершине vt в виде последовательности номеров вершин.
(3) По алгоритму Дейкстры для этой же пары вершин найти вес и маршрут
минимального веса.
(4) По алгоритму Прима для данного графа найти минимальный остов в виде списка
ребер остова.
В отчетах приведите протоколы вычилений (последовательности промежуточных
состояний вычислений).

##Вариант 15
w({v1,v6})=19, w({v1,v7})=26, w({v1,v8})=9, w({v2,v3})=2, w({v2,v4})=28,
w({v2,v7})=12, w({v2,v8})=25, w({v3,v6})=16, w({v3,v8})=21, w({v4,v5})=20,
w({v4,v8})=31, w({v6,v7})=15, w({v6,v8})=18.
