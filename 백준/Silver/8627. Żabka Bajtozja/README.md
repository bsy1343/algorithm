# [Silver II] Żabka Bajtozja - 8627

[문제 링크](https://www.acmicpc.net/problem/8627)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 21, 맞힌 사람: 18, 정답 비율: 38.298%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Żabka Bajtozja siedzi sobie na jednym z kamieni wystających ponad powierzchnię stawu i chce wskoczyć do wody. Jednak nie jest jej obojętne, w jakim miejscu to uczyni. Ot&oacute;ż chciałaby zanurzyć się możliwie jak najdalej od miejsca, w kt&oacute;rym się w tym momencie znajduje.</p>

<p>Żabka jest jednak świadoma, że długość skoku, jaki może wykonać, jest ograniczona. Tak więc największa odległość, w jakiej mogłaby wskoczyć wody, byłaby r&oacute;wna właśnie długości jej najdłuższego skoku, gdyby nie wystające z wody kamienie. Bajtozja wpadła na pomysł, że może skakać po kamieniach, w ten spos&oacute;b oddalić się i wskoczyć do wody w miejscu bardziej oddalonym od swojej początkowej pozycji. Pom&oacute;ż jej i napisz program, kt&oacute;ry policzy, jak daleko od swojego aktualnego położenia żabka może się zanurzyć.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis położeń kamieni wystających ponad powierzchnię wody, umiejscowienie kamienia, na kt&oacute;rym siedzi Bajtozja oraz długość maksymalnego skoku, jaki jest ona w stanie wykonać,</li>
	<li>wyznaczy największą odległość, jaką żabka może przebyć z miejsca, w kt&oacute;rym aktualnie siedzi, do miejsca, w kt&oacute;rym zanurzy się pod wodę,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajdują się trzy liczby całkowite $n$, $p$&nbsp;oraz $s$&nbsp;($1 &le; n &le; 1\,000$, $1 &le; p &le; n$, $1 &le; s &le; 1\,000\,000\,000$), pooddzielane pojedynczymi odstępami i oznaczające odpowiednio: liczbę kamieni wystających ze stawu, numer kamienia, na kt&oacute;rym siedzi Bajtozja oraz maksymalną długość skoku, jaki może ona wykonać, podaną w bajtymetrach.</p>

<p>W każdym z kolejnych $n$&nbsp;wierszy znajdują się dwie liczby całkowite $x_i$&nbsp;oraz $y_i$&nbsp;($-1\,000\,000\,000 &le; x_i, y_i &le; 1\,000\,000\,000$&nbsp;dla $1 &le; i &le; n$), oddzielone pojedynczym odstępem i oznaczające wsp&oacute;łrzędne w bajtymetrach $i$-tego wystającego ze stawu kamienia.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać w pierwszym i jedynym wierszu wyjścia jedną liczbę, oznaczającą maksymalną odległość w bajtymetrach miejsca, w kt&oacute;rym Bajtozja może się zanurzyć, od miejsca, w kt&oacute;rym początkowo siedzi. Odległość tę należy wypisać z trzema cyframi po przecinku. Wypisana wartość może się r&oacute;żnić od dokładnej o co najwyżej $0.001$.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/8627.%E2%80%85%C5%BBabka%E2%80%85Bajtozja/98d54943.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/8627.%E2%80%85%C5%BBabka%E2%80%85Bajtozja/98d54943.png" data-original-src="https://upload.acmicpc.net/2fcdb4cc-3772-48b6-a945-f5254de06e6a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>