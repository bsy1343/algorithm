# [Gold III] Trikontenerowiec - 8541

[문제 링크](https://www.acmicpc.net/problem/8541)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 8, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>Kopalnia Glinek HyperMarsjańskich (KGHyM) wydobywa (na Marsie) czerwone glinki węglowo-krzemowe i prasuje je w płyty wygodne w transporcie. Każda płyta ma standardową szerokość i grubość, ale poszczeg&oacute;lne płyty mogą się r&oacute;żnić wysokością i jakością materiału. Wyr&oacute;żnia się 1000 klas jakości glinek i produkuje się płyty o wysokościach 1, 2, ..., 500000mm. Cena płyty zależy&nbsp;<b>tylko</b>&nbsp;od jakości materiału - nie jest natomiast ważna jej wysokość. Płyta z materiału klasy <em>q</em>&nbsp;kosztuje&nbsp;<em>q</em>&nbsp;galaktar&oacute;w.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8541.%E2%80%85Trikontenerowiec/f4bc52bf.png" data-original-src="https://upload.acmicpc.net/9d205b99-dd31-46fc-a1f7-eca89b64f139/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Trikontenerowiec galaktyczny, to rodzaj statku kosmicznego, kt&oacute;ry służy do przewozu płyt produkowanych przez KGHyM. Ładownia tego statku to hala, w kt&oacute;rej w podłodze zamontowano r&oacute;wnolegle <em>M</em>&nbsp;prowadnic na płyty - w każdej prowadnicy można umieścić tylko jedna płytę. Ładownia ma spadzisty strop (patrz rysunek), tzn. jej sufit w jednym końcu jest na wysokości 1&nbsp;mm, a w drugim na wysokości <em>M</em>&nbsp;mm - oznacza to, że strop nad prowadnicą o numerze <em>n</em>&nbsp;jest na wysokości&nbsp;<em>n</em>&nbsp;milimetr&oacute;w i można w niej umieszczać tylko płyty o wysokości mniejszej lub r&oacute;wnej tej wartości. Na hałdach KGHyM leżą płyty w oczekiwaniu na transport, a do doku przybił właśnie trikontenerowiec i jego załoga rozpoczęła załadunek statku. Wiadomo, że kapitanowi zależy na zabraniu ładunku o jak największej sumarycznej wartości, ale jest ograniczony rozmiarami ładowni (niestety nie może przyciąć zbyt dużych płyt, gdyż po sprasowaniu płyty nie poddają się łatwo obr&oacute;bce). Wiadomo także, że doświadczona załoga statku wybierze ładunek optymalnie zgodnie z zaleceniami kapitana. Przedstawiciel KGHyM musi zdecydować, ile ma zapłacić za ładunek kapitan statku.</p>

<p>Napisz program kt&oacute;ry:</p>

<ul>
	<li>wczytuje rozmiar ładowni i rozmiary płyt leżących na hałdzie,</li>
	<li>oblicza, jaka jest maksymalna wartość ładunku, kt&oacute;ry można zabrać na statek,</li>
	<li>wypisuje maksymalną wartość ładunku.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia podane są liczby naturalne <em>M</em>&nbsp;i&nbsp;<em>N</em>&nbsp;oddzielone spacją (1 &le; <em>M</em> &le; 500000, 0 &le; <em>N</em> &le; 1000000) - <em>M</em>&nbsp;oznacza długość, maksymalną wysokość i jednocześnie liczbę prowadnic w ładowni, a <em>N</em>&nbsp;jest liczbą płyt na hałdzie. W kolejnych <em>N</em>&nbsp;wierszach znajdują się opisy płyt z hałdy - po jednym w wierszu. Każdy opis płyty to dwie liczby naturalne <em>w</em>&nbsp;i <em>h</em>&nbsp;oddzielone spacją (1 &le; <em>w</em> &le; 1000, 1 &le; <em>h</em> &le; 500000) - pierwsza liczba oznacza klasę jakości tworzywa płyty, a druga wysokość płyty w milimetrach. Uwaga: Wśr&oacute;d płyt na hałdzie mogą znajdować się takie, kt&oacute;rych wysokości są większe od maksymalnej dopuszczalnej wysokości ładowni statku.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyniku należy podać jedną liczbę - wartość optymalnego ładunku.</p>