# [Gold I] Wrocławskie ZOO - 8540

[문제 링크](https://www.acmicpc.net/problem/8540)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

너비 우선 탐색, 데이크스트라, 그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>We wrocławskim ZOO jest <em>a</em>&nbsp;bram wejściowych oznaczonych numerami 1, 2, ..., <em>a</em>, <em>n</em>&nbsp;wybieg&oacute;w dla zwierząt oznaczonych numerami <em>a</em> + 1, <em>a</em> + 2, ..., <em>a</em> + <em>n</em>&nbsp;oraz <em>b</em>&nbsp;bram wyjściowych oznaczonych numerami <em>a</em> + <em>n</em> + 1, <em>a</em> + <em>n</em> + 2, ..., <em>a</em> + <em>n</em> + <em>b</em>. W ZOO są ścieżki prowadzące od bram wejściowych do wybieg&oacute;w, pomiędzy wybiegami i od wybieg&oacute;w do bram wyjściowych. Ścieżki w ZOO nie przecinają sie ze sobą (jest to możliwe, gdyż niekt&oacute;re ścieżki biegną tunelami lub wiszącymi mostami) i są dwukierunkowe.</p>

<p>Dzieci ze szkoły w Ziębicach wybierają się na lekcję przyrody do ZOO. Pani nauczycielka wyznaczyła kilku (dokładnie <em>k</em>) uczni&oacute;w i zleciła im przygotowanie w domu referat&oacute;w dotyczących wybranych zwierząt. Pani zaplanowała wycieczkę po ZOO tak, by odwiedzić wybiegi wszystkich opisywanych przez nauczycielkę zwierząt, kierując się następującymi kryteriami. Trasa:</p>

<ul>
	<li>może rozpoczynać się od dowolnej bramy wejściowej,</li>
	<li>musi odwiedzać wybiegi wszystkich wskazanych zwierząt,</li>
	<li>może kończyć się przy dowolnej bramie wyjściowej,</li>
	<li>nie może w trakcie (opr&oacute;cz początku i końca) przebiegać przez żadną bramę,</li>
	<li>ma być jak&nbsp;<i>najkr&oacute;tsza</i>, tzn. przebiegać przez jak najmniejszą liczbę wybieg&oacute;w.</li>
</ul>

<p>Niestety w ostatniej chwili pojawił się dodatkowy problem. Okazało się, że dzieci ułożyły swoje referaty w jedną długą opowieść o wybranych zwierzętach i teraz trzeba odwiedzić wybiegi w kolejności wyznaczonej przez tę opowieść i na dodatek, by nie psuć efektu, nie można odwiedzić żadnego ze zwierząt, zanim nie nadejdzie jego pora w opowieści. Tak więc doszedł dodatkowy warunek:</p>

<ul>
	<li>trasa nie może dotrzeć do wybiegu <em>i</em>-tego z wybranych zwierząt, zanim nie odwiedzi wybiegu zwierzęcia <em>i</em> - 1.</li>
</ul>

<p>Napisz program kt&oacute;ry:</p>

<ul>
	<li>wczytuje liczby: bram wejściowych, wybieg&oacute;w, bram wyjściowych, wybranych zwierząt i ścieżek w ZOO oraz opisy ścieżek,</li>
	<li>oblicza, jaka jest minimalna liczba wybieg&oacute;w, kt&oacute;re trzeba odwiedzić wchodząc do ZOO dowolną bramą, następnie odwiedzając wybiegi zwierząt zgodnie z kolejnością, w jakiej te zwierzęta występują w opowieści (i nie odwiedzając żadnego zwierzęcia, przed zwierzętami, kt&oacute;re występują przed nim w opowieści), i na koniec wychodząc przez dowolną bramę wyjściową,</li>
	<li>wypisuje minimalną liczbę wybieg&oacute;w, kt&oacute;re trzeba odwiedzić po drodze (powtarzające się wybiegi należy liczyć wielokrotnie) lub liczbę -1, gdy znalezienie takiej trasy nie jest możliwe.</li>
</ul>

### 입력

<p>W pierwszym wierszu podane są liczby naturalne <em>a</em>, <em>n</em>, <em>b</em>, <em>k</em>, <em>m</em>&nbsp;oddzielone spacjami 1 &le; <em>a</em> &le; 25, 1 &le; <em>b</em> &le; 25, 1 &le; <em>k</em> &le; 100, 1 &le; <em>n</em> &le; 1000, 1 &le; <em>m</em> &le; 5000). Liczby te oznaczają: <em>a</em>&nbsp;- liczbę wejść do ZOO, <em>b</em>&nbsp;- liczbę wyjść z ZOO, <em>k</em>&nbsp;- liczbę wybranych zwierząt,<em>n</em>&nbsp;- liczbę wybieg&oacute;w w ZOO, <em>m</em>&nbsp;- liczbę ścieżek w ZOO. W kolejnych <em>k</em>&nbsp;wierszach podane są numery wybieg&oacute;w wybranych zwierząt - po jednej liczbie w wierszu i zgodnie z kolejnością, w jakiej zwierzęta występują w opowieści (każde zwierzę w ZOO może w niej wystąpić najwyżej jeden raz). W następnych <em>m</em>&nbsp;wierszach podane są opisy ścieżek - po jednym w wierszu. Opis ścieżki składa się z dw&oacute;ch r&oacute;żnych liczb całkowitych oddzielonych spacją - są to numery bram lub wybieg&oacute;w połączonych bezpośrednio ścieżką.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia należy napisać:</p>

<ul>
	<li>liczbę&nbsp;<code>-1</code>, jeżeli wyznaczenie trasy zgodnie z powyższymi zasadami nie jest możliwe lub</li>
	<li>liczbę naturalną, kt&oacute;ra oznacza minimalną liczbę wybieg&oacute;w (łącznie z tymi &quot;interesującymi&quot;), przez kt&oacute;re musi przebiegać trasa wyznaczona zgodnie z podanymi wyżej zasadami.</li>
</ul>