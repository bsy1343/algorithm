# [Gold III] Berek - 8763

[문제 링크](https://www.acmicpc.net/problem/8763)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

그래프 이론, 그래프 탐색, 트리, 너비 우선 탐색, 최단 경로, 깊이 우선 탐색

### 문제 설명

<p>Jedną z ulubionych zabaw podw&oacute;rkowych Kornelii jest berek, w kt&oacute;rego zwykle bawi się ze swoją koleżanką Joasią. Podw&oacute;rko na kt&oacute;rym odbywa się zabawa składa się z&nbsp;<strong>N</strong>&nbsp;zakątk&oacute;w (ponumerowanych od 1 do&nbsp;<strong>N</strong>) połączonych&nbsp;<strong>N</strong>-1 przejściami i wiemy, że z każdego zakątka podw&oacute;rka da się dostać do każdego innego.</p>

<p>W momencie rozpoczęcia zabawy Kornelia znajduje się w zakątku&nbsp;<strong>K</strong>, Joasia w zakątku&nbsp;<strong>J</strong>&nbsp;i zadaniem Kornelii jest złapanie Joasi. Dziewczynki biegną z taką samą prędkością, i pokonanie jednego przejścia zajmuje każdej z nich dokładnie&nbsp;<em>jedną chwilę</em>. Na początku każdej chwili każda z dziewczynek wybiera, do kt&oacute;rego z sąsiednich (tj. połączonych z obecnym) zakątk&oacute;w chce pobiec. Na końcu danej chwili dziewczynki są już w nowych zakątkach podw&oacute;rka i cały proces zaczyna się od początku, aż do momentu w kt&oacute;rym obie dziewczynki znajdą się w tym samym zakątku, tj. do momentu kiedy Kornelia złapie Joasię.</p>

<p>Dziewczynki wybierają zakątek do kt&oacute;rego chcą pobiec według następujących reguł:</p>

<ul>
	<li>Kornelia zawsze wybiera ten spośr&oacute;d sąsiednich zakątk&oacute;w, kt&oacute;ry leży na ścieżce prowadzącej do zakątka, w kt&oacute;rym aktualnie znajduje się Joasia (tj. biegnie w stronę Joasi).</li>
	<li>Joasia biegnie tam, gdzie się jej podoba, ale nigdy nie wybiera przejścia do zakątka, w kt&oacute;rym aktualnie znajduje się Kornelia. Joasia może zdecydować, że w danej chwili nigdzie nie biegnie (tj. przez jedną chwilę zostaje w tym zakątku, w kt&oacute;rym teraz jest).</li>
</ul>

<p>Hektor obserwuje zabawę z okna swojego pokoju i zastanawia się, ile maksymalnie chwil zajmie Kornelii złapanie Joasi (tj. ile czasu potrwa zabawa jeśli Joasia będzie podejmowała optymalne, prowadzące do najdłuższego czasu pościgu, decyzje). Czy potrafisz napisać program kt&oacute;ry rozwiąże ten problem za Hektora?</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii opisu pojedynczego zestawu testowego znajdują się trzy oddzielone pojedynczymi spacjami liczby naturalne&nbsp;<strong>N</strong>,&nbsp;<strong>K</strong>&nbsp;i&nbsp;<strong>J</strong>&nbsp;(2 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 1000000 | 1 &lt;=&nbsp;<strong>K</strong>,&nbsp;<strong>J</strong>&nbsp;&lt;=&nbsp;<strong>N&nbsp;</strong>|&nbsp;<strong>K</strong>&nbsp;r&oacute;żne od&nbsp;<strong>J</strong>). W kolejnych&nbsp;<strong>N</strong>-1 liniach zestawu opisywane będą kolejne przejścia między zakątkami podw&oacute;rka.</p>

<p>Opis pojedynczego przejścia składa się z dw&oacute;ch oddzielonych pojedynczą spacją liczb naturalnych&nbsp;<strong>a<sub>i</sub></strong>&nbsp;i&nbsp;<strong>b<sub>i</sub></strong>&nbsp;(1 &lt;=&nbsp;<strong>a<sub>i</sub></strong>&nbsp;,&nbsp;<strong>b<sub>i</sub></strong>&nbsp;&lt;=&nbsp;<strong>N</strong>), kt&oacute;re oznaczają obecność dwukierunkowego przejścia pomiędzy zakątkami&nbsp;<strong>a<sub>i</sub></strong>&nbsp;i&nbsp;<strong>b<sub>i</sub></strong>.</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej linii wypisać maksymalny czas trwania zabawy (wyrażony w chwilach). Kolejność wypisywanych odpowiedzi musi odpowiadać kolejności zestaw&oacute;w na wejściu.</p>