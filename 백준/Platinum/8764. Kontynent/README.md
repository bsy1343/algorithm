# [Platinum V] Kontynent - 8764

[문제 링크](https://www.acmicpc.net/problem/8764)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

기하학

### 문제 설명

<p>Kornelia jest bardzo ciekawa otaczającego ją świata. Chłonie wiedzę w takim tempie, że nie wystarczają jej już nawet dodatkowe zajęcia w przedszkolu. Wieczorami otwiera swoją ulubioną &quot;Geografię dla najmłodszych&quot; i poznaje obce kraje z odległych kontynent&oacute;w.</p>

<p>Każdy rozdział książki opowiada o jednym kontynencie, kt&oacute;rego mapa polityczna znajduje się na pierwszej stronie rozdziału. Właściwie &quot;znajduje się&quot; to za dużo powiedziane - trzeba ją bowiem odtworzyć samemu. Na marginesie strony podane są wsp&oacute;łrzędne wszystkich odcink&oacute;w tworzących granice państw na danym kontynencie. Zadaniem naszej bohaterki jest nanieść je na mapę i pokolorować poszczeg&oacute;lne kraje - każdy innym kolorem. Kornelia zastanawia się, jak wielu r&oacute;żnych kredek będzie potrzebować oraz jak duże powierzchnie będzie musiała kolorować każdą z nich. Poprosiła więc o pomoc Ciebie jako zaufanego kolegę swojego brata, Hektora.</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii pojedynczego zestawu testowego znajduje się jedna liczba całkowita&nbsp;<strong>N</strong>&nbsp;( 3 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 8 000 ), określająca liczbę odcink&oacute;w reprezentujących granice państw kontynentu. Każda z kolejnych&nbsp;<strong>N</strong>&nbsp;linii zawiera cztery liczby całkowite&nbsp;<strong>x<sub>1</sub></strong>,&nbsp;<strong>y<sub>1</sub></strong>,&nbsp;<strong>x<sub>2</sub></strong>,&nbsp;<strong>y<sub>2</sub></strong>&nbsp;( 0 &lt;=&nbsp;<strong>x<sub>1</sub></strong>,&nbsp;<strong>y<sub>1</sub></strong>,&nbsp;<strong>x<sub>2</sub></strong>,&nbsp;<strong>y<sub>2</sub></strong>&nbsp;&lt;= 10 000 ) oznaczająca odcinek o końcach w punktach (<strong>x<sub>1</sub></strong>,<strong>y<sub>1</sub></strong>) i (<strong>x<sub>2</sub></strong>,<strong>y<sub>2</sub></strong>).</p>

<p>Każdy z odcink&oacute;w ma niezerową długość i reprezentuje fragment granicy między dokładnie dwoma r&oacute;żnymi państwami, lub fragment granicy państwa na krawędzi kontynentu/mapy. Żadne dwa odcinki nie przecinają się, a co najwyżej stykają się końcami. Każde z państw ma kształt wielokąta prostego bez dziur.</p>

### 출력

<p>Dla każdego zestawu testowego należy w pierwszej linii wypisać liczbę&nbsp;<strong>P</strong>&nbsp;państw na kontynencie podanym na wejściu. W następnej linii należy wypisać dokładnie&nbsp;<strong>P</strong>&nbsp;liczb oddzielonych pojedynczą spacją, oznaczające pola wielokąt&oacute;w reprezentujących państwa. Pola te powinny być uszeregowane w kolejności niemalejącej i wypisane z dokładnością dokładnie jednego miejsca po przecinku.</p>