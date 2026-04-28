# [Platinum III] Plan metra - 26835

[문제 링크](https://www.acmicpc.net/problem/26835)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 5, 맞힌 사람: 5, 정답 비율: 22.727%

### 분류

많은 조건 분기, 해 구성하기

### 문제 설명

<p>Bajtazar udał się na wycieczkę do Bajtogrodu i postanowił, że podczas całego pobytu w mieście będzie poruszał się metrem. Wysiadłszy na dworcu kolejowym (przy kt&oacute;rym znajduje się jedna ze stacji metra), poszedł zakupić bilety w automacie. Z cennika wynikało, że przejazd na trasie prowadzącej od stacji &bdquo;Dworzec kolejowy&rdquo; do stacji &bdquo;Lotnisko&rdquo; jest darmowy, natomiast dla wszystkich pozostałych tras cena biletu jest r&oacute;wna odległości pomiędzy stacją początkową a stacją docelową. Dla wygody pasażer&oacute;w przyjeżdżających do Bajtogrodu, przy automacie była wypisana lista cen bilet&oacute;w dla tras od stacji &bdquo;Dworzec kolejowy&rdquo; do wszystkich pozostałych stacji oraz dla tras od stacji &bdquo;Lotnisko&rdquo; do wszystkich pozostałych stacji.</p>

<p>Bajtazar dowiedział się też, że metro posiada n stacji, połączonych oszczędną siecią n &minus; 1 tuneli dodatniej długości (wystarczających jednak do przejechania z dowolnej stacji do dowolnej innej). Na podstawie tych wszystkich informacji nasz bohater chciałby wyznaczyć połączenia pomiędzy stacjami lub stwierdzić, że posiadane przez niego dane są błędne.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną dodatnią liczbę całkowitą n oznaczającą liczbę stacji metra w Bajtogrodzie. Stacje są numerowane liczbami od 1 do n, przy czym stacja &bdquo;Dworzec kolejowy&rdquo; ma numer 1, a stacja &bdquo;Lotnisko&rdquo; ma numer n.</p>

<p>W drugim wierszu znajduje się ciąg n &minus; 2 liczb całkowitych d<sub>2</sub>, d<sub>3</sub>, . . . , d<sub>n&minus;1</sub> z przedziału [1, 1 000 000], pooddzielanych pojedynczymi odstępami; i-ta liczba w ciągu oznacza cenę biletu na trasie od stacji &bdquo;Dworzec kolejowy&rdquo; do stacji o numerze i. Cena ta jest r&oacute;wna długości trasy.</p>

<p>W trzecim wierszu znajduje się ciąg l<sub>2</sub>, l<sub>3</sub>, . . . , l<sub>n&minus;1</sub> w takim samym formacie, opisujący ceny bilet&oacute;w na trasach od stacji &bdquo;Lotnisko&rdquo;.</p>

### 출력

<p>Jeżeli nie istnieje żaden plan połączeń pomiędzy stacjami zgodny z informacjami uzyskanymi przez Bajtazara, na standardowe wyjście należy wypisać jeden wiersz ze słowem <code>NIE</code>.</p>

<p>W przeciwnym wypadku w pierwszym wierszu należy wypisać jedno słowo <code>TAK</code>, a w kolejnych n&minus;1 wierszach połączenia pomiędzy stacjami. Każdy z tych wierszy powinien zawierać trzy liczby całkowite a, b i c oddzielone pojedynczymi odstępami, co oznacza, że stacje o numerach a i b są połączone tunelem o długości c. Jeżeli jest więcej niż jedna poprawna odpowiedź, Tw&oacute;j program powinien wypisać dowolną z nich.</p>

### 제한

<ul>
	<li>n &le; 500 000</li>
</ul>

### 힌트

<p>Wyjaśnienie do przykładu: Poniższy rysunek przedstawia sieć połączeń zgodną z informacjami zdobytymi przez Bajtazara; umieszczono na niej r&oacute;wnież długości tuneli.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26835.%E2%80%85Plan%E2%80%85metra/633e60db.png" data-original-src="https://upload.acmicpc.net/48c76b51-d7e5-4e83-8e4b-711f581ea11b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 145px;" /></p>