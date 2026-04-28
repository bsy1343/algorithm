# [Platinum III] Zdjęcia - 8623

[문제 링크](https://www.acmicpc.net/problem/8623)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>Mały Bajtek na swoje si&oacute;dme urodziny dostał od rodzic&oacute;w aparat fotograficzny. Od tego czasu uwielbia robić zdjęcia każdej nowo poznanej osobie. Każde zdjęcie, kt&oacute;re zrobi, wywiesza na tablicy korkowej w swoim pokoju. Od urodzin minęło parę miesięcy i tablica jest już mocno zapełniona. Niekt&oacute;re zdjęcia są całkowicie zasłonięte, inne częściowo... Jeszcze inne, najnowsze, są widoczne w całości.</p>

<p>Kiedy Bajtek przyczepia nowe zdjęcia pinezkami, zastanawia się, ile spośr&oacute;d dotychczas wywieszonych zdjęć przebija każda z nowych pinezek. Chłopiec jest ciekaw, ile zdjęć może maksymalnie przebić jedna taka pinezka. Pom&oacute;ż Bajtkowi zaspokoić ciekawość.</p>

<p>Napisz program, kt&oacute;ry</p>

<ul>
	<li>wczyta ze standardowego wejścia opis zdjęć znajdujących się na tablicy korkowej Bajtka,</li>
	<li>wyznaczy maksymalną liczbę zdjęć, kt&oacute;re może przebić pinezka wbita w tablicę,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita $n$&nbsp;($1 &le; n &le; 100\,000$) - jest to liczba zdjęć na tablicy. W każdym z następnych $n$&nbsp;wierszy znajdują się po cztery liczby całkowite. W wierszu $i+1$-szym zapisane są liczby $L_i$, $D_i$, $P_i$, $G_i$&nbsp;($-200\,000 &le; L_i, D_i, P_i, G_i &le; 200\,000$&nbsp;oraz $L_i &lt; P_i$&nbsp;i $D_i &lt; G_i$), poddzielane pojedynczymi odstępami. Są to wsp&oacute;łrzędne zdjęcia w układzie kartezjańskim na tablicy: $(L_i, D_i)$&nbsp;to wsp&oacute;łrzędne lewego dolnego, natomiast $(P_i, G_i)$&nbsp;to wsp&oacute;łrzędne prawego g&oacute;rnego rogu zdjęcia. Przyjmujemy, że pinezka wbita w punkt $(x, y)$&nbsp;przebije to zdjęcie, jeśli $L_i &le; x &le; P_i$&nbsp;oraz $D_i &le; y &le; G_i$.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać w pierwszym i jedynym wierszu wyjścia jedną liczbę całkowitą - maksymalną liczbę zdjęć, kt&oacute;re może przebić pinezka wbita w pewnym miejscu tablicy.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8623.%E2%80%85Zdj%C4%99cia/17f3a689.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8623.%E2%80%85Zdj%C4%99cia/17f3a689.png" data-original-src="https://upload.acmicpc.net/8f8ce394-03f3-40d6-91eb-a0f4aa2517c3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Obszar zakreskowany na rysunku reprezentuje fragment tablicy, w kt&oacute;rym należy przyczepić pinezkę, aby przebić 3 zdjęcia. Zauważ, że dwa zdjęcia na tablicy (pierwsze i czwarte) dokładnie się pokrywają.</p>