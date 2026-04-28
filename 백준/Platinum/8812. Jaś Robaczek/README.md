# [Platinum III] Jaś Robaczek - 8812

[문제 링크](https://www.acmicpc.net/problem/8812)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 104, 정답: 39, 맞힌 사람: 27, 정답 비율: 31.765%

### 분류

자료 구조, 트리, 오프라인 쿼리, 최소 공통 조상, 희소 배열, 오일러 경로 테크닉

### 문제 설명

<p>Jaś jest robaczkiem i postanowił zamieszkać na drzewie. Drzewo, kt&oacute;re wybrał jest bardzo młode - w momencie przeprowadzki Jasia ma tylko jeden wierzchołek ( oznaczony numerem 1 ).&nbsp;</p>

<p>Następnie zar&oacute;wno drzewo jak i Jaś zajęli się swoimi sprawami. To znaczy:</p>

<ul>
	<li>Drzewo zaczęło rosnąć, regularnie wypuszczając nowe wierzchołki. Zapis &quot;D&nbsp;<strong>x</strong>&quot; oznacza, że w drzewie pojawił się nowy wierzchołek, przyłączony do wierzchołka&nbsp;<strong>x</strong>&nbsp;obecnego już wcześniej w drzewie ( w razie wątpliwości sp&oacute;jrz do przykładu i wyjaśnienia przykładu ).</li>
	<li>Jaś zaczął spacerować po drzewie, każdorazowo przechodząc z aktualnego wierzchołka do jednego z jego bezpośrednich sąsiad&oacute;w. Zapis &quot;J&nbsp;<strong>x</strong>&quot; oznacza, że Jaś przesunął się o jeden wierzchołek w stronę wierzchołka&nbsp;<strong>x</strong>&nbsp;( zwr&oacute;ć uwagę na to, że nie podajemy wierzchołka w kt&oacute;rym Jaś de facto się znalazł, tylko ten, w kt&oacute;rego stronę się poruszył ).</li>
</ul>

<p>Hektor obserwuje to wszystko i chciałby po każdym ruchu Jasia znać jego aktualną pozycję. Czy potrafisz mu pom&oacute;c?</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii zestawu znajduje się liczba naturalna&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 10<sup>6</sup>&nbsp;) oznaczająca liczbę wydarzeń.</p>

<p>W kolejnych&nbsp;<strong>N</strong>&nbsp;liniach podawane są opisy wydarzeń. Każdy z nich ma jedną z dw&oacute;ch postaci o opisanym w treści znaczeniu:</p>

<ul>
	<li>&quot;D&nbsp;<strong>x</strong>&quot; ( 1 &lt;=&nbsp;<strong>x&nbsp;</strong>&lt;= aktualna liczba wierzchołk&oacute;w w drzewie )</li>
	<li>&quot;J&nbsp;<strong>x</strong>&quot; ( 1 &lt;=&nbsp;<strong>x</strong>&nbsp;&lt;= aktualna liczba wierzchołk&oacute;w w drzewie )</li>
</ul>

<ul>
	<li>Jeśli w momencie podania opisu &quot;J&nbsp;<strong>x</strong>&quot; Jaś znajduje się już w wierzchołku&nbsp;<strong>x</strong>, to znaczy że w nim pozostaje ( taką, niezmienioną pozycję należy oczywiście r&oacute;wnież wypisać ).</li>
	<li>Kolejne, dołączane do drzewa wierzchołki numerowane są kolejnymi liczbami naturalnymi. Pierwszy dołączony wierzchołek otrzyma numer 2, kolejny 3, etc.</li>
</ul>

### 출력

<p>Dla każdego zestawu należy wypisać tyle linii, ile razy na wejściu pojawiło się wydarzenie &quot;J&nbsp;<strong>x</strong>&quot;. Dla każdego takiego wydarzenia należy wypisać numer wierzchołka, w kt&oacute;rym znalazł się Jaś.</p>

### 힌트

<p>Na początku drzewo wypuszcza cztery nowe wierzchołki, ma więc ich w sumie 5. Pierwsze cztery wierzchołki są ze sobą połączone następująco 1-2-3-4. Piąty wierzchołek także przyłączany jest do wierzchołka numer 3.&nbsp;</p>

<p>P&oacute;źniej przychodzi kolej na wędr&oacute;wki Jasia. Pierwszy ruch wykonywany jest w stronę piątego wierzchołka, Jaś przemieszcza się więc do wierzchołka nr 2. Kolejne dwa ruchy w stronę piątego wierzchołka powodują, że Jaś kolejno trafia do wierzchołk&oacute;w 3 i wreszcie 5. Następne dwa ruchy wykonywane są w stronę wierzchołka 4 - Jaś musi cofnąć się do wierzchołka 3, aby tam trafić.</p>

<p>Wreszcie drzewo wypuszcza sz&oacute;sty wierzchołek przyłączony do pierwszego wierzchołka. Jaś przesuwa się w tamtą stronę, a więc w g&oacute;rę drzewa, do wierzchołka nr 3.</p>