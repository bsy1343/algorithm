# [Silver I] Eurozwrotnica - 8782

[문제 링크](https://www.acmicpc.net/problem/8782)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 23, 맞힌 사람: 20, 정답 비율: 54.054%

### 분류

구현, 자료 구조, 그리디 알고리즘, 시뮬레이션, 큐

### 문제 설명

<p>Czy pamiętacie pana Pawła, kolejarza z podwrocławskiej miejscowości, kt&oacute;ry był bohaterem zadania&nbsp;Kolejarz Paweł? W ostatnich miesiącach w jego życiu zawodowym sporo się zmieniło. Ze względu na rozbudowę infrastruktury kolejowej przed Euro 2012, na jego malutkiej stacyjce wybudowano drugi tor!</p>

<p>Po rozbudowie stacja pana Pawła pozostała jednokierunkowa.&nbsp;<a href="http://pl.wikipedia.org/wiki/Sk%C5%82ad_kolejowy">Składy kolejowe</a>&nbsp;nadjeżdżają na stację od zachodu, i wyjeżdzają przeciwną stroną. Do pana Pawła należy podejmowanie decyzji na kt&oacute;ry tor skierować każdy z nadjeżdzających skład&oacute;w, i kiedy nakazać każdemu ze skład&oacute;w opuszczenie stacji. Na jednym torze może oczekiwać wiele skład&oacute;w, ale muszą opuścić stację w takiej kolejności, w kt&oacute;rej wjechały na tor (to znaczy, pociągi nie mogą wyprzedzać się na torze).</p>

<p>Taka budowa stacji umożliwia panu Pawłowi wpływanie na kolejność skład&oacute;w wyjeżdżających ze stacji. Przykładowo, jeśli na stację przyjeżdżają kolejno pociągi C, A, B, pan Paweł może skierować pierwszy z pociąg&oacute;w na pierwszy tor, dwa kolejne na drugi, a potem nakazać składom odjeżdżać w kolejności A, B, C.</p>

<p>Jutro na stację ma przyjechać&nbsp;<strong>N</strong>&nbsp;skład&oacute;w ponumerowanych od 1 do&nbsp;<strong>N</strong>. Znając kolejność, w jakiej przyjadą na stację sprawdź, czy da się tak przydzielać tory przyjeżdząjącym pociągom, żeby opuszczały stację w kolejności 1,2,...,<strong>N</strong>.</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii opisu pojedynczego zestawu testowego znajduje się jedna liczba naturalna&nbsp;<strong>N</strong>&nbsp;(1 &lt;= N &nbsp;&lt;= 1000000) oznaczająca liczbę pociąg&oacute;w przyjeżdzających na stację. W drugiej linii opisu zestawu znajduje się&nbsp;<strong>N</strong>&nbsp;oddzielonych spacjami r&oacute;żnych liczb&nbsp;<strong>p<sub>i</sub></strong>&nbsp;( 1 &lt;=&nbsp;<strong>p<sub>i</sub></strong>&nbsp;&lt;=&nbsp;<strong>N</strong>&nbsp;) oznaczających numery pociąg&oacute;w wymienione w kolejności, w jakiej będą przyjeżdżać na stację.</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej linii wypisać słowo &quot;TAK&quot;, jeśli da się ustawić pociągi w wymaganej kolejności i &quot;NIE&quot; w przeciwnym wypadku.</p>