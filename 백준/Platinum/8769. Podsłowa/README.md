# [Platinum I] Podsłowa - 8769

[문제 링크](https://www.acmicpc.net/problem/8769)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

자료 구조, 문자열, 스택, 접미사 배열과 LCP 배열

### 문제 설명

<p>Chodnik przed szkołą kolejny raz został pokryty grubą warstwą opadłych liści. Obowiązkiem aktualnych dyżurnych, Hektora i Wiktora, jest ich zagrabienie. Chłopcy, nie mogąc ustalić kto powinien zająć się liściowym problemem, postanowili ciągnąć dość nietypowe losy. Najpierw uzgodnili między sobą jedno słowo składające się z&nbsp;<strong>N</strong>&nbsp;małych liter alfabetu angielskiego, kt&oacute;rego wszystkie możliwe niepuste podsłowa wrzucili do urny. Następnie obaj podchodzą do urny i losują bez zwracania po jednym słowie (najpierw Hektor, potem Wiktor). Grabić liście będzie ten, kt&oacute;rego wylosowane słowo jest mniejsze leksykograficznie. Jeśli obaj wylosują takie same słowa, każdy zagrabi po połowie chodnika. Jaka jest szansa, że do tego dojdzie?</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii pojedynczego zestawu testowego znajduje się jedna liczba całkowita&nbsp;<strong>N</strong>&nbsp;( 2 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 50 000 ), określająca liczbę liter wybranego przez chłopc&oacute;w słowa. W drugiej linii znajduje się to słowo.</p>

### 출력

<p>Dla każdego zestawu testowego należy w jednej linii wypisać jedną liczbę wymierną, będącą prawdopodobieństwem tego, że losowanie zakończy się remisem. Liczbę tę należy wypisać w postaci &quot;<strong>licznik</strong>&nbsp;/&nbsp;<strong>mianownik</strong>&quot;, gdzie&nbsp;<strong>licznik</strong>&nbsp;i&nbsp;<strong>mianownik</strong>&nbsp;są liczbami względnie pierwszymi.</p>

### 힌트

<p>W trzecim zestawie testowym słowo ma dokładnie 6 podsł&oacute;w: a [1:1], aa [1:2], aaa [1:3], a [2:2], aa [2:3], a [3:3] (w nawiasach podano zakres indeks&oacute;w, kt&oacute;remu dane podsłowo odpowiada). Jest 30 możliwych wynik&oacute;w losowania, ale tylko 8 z nich prowadzi do remisu (pierwsza liczba z pary oznacza nr podsłowa wylosowany przez Hektora, druga liczba to nr podsłowa Wiktora): (1,4), (1,6), (4,1), (4,6), (6,1), (6,4), (2,5), (5,2).</p>