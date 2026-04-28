# [Platinum V] Modernizacja Bajtocji - 31696

[문제 링크](https://www.acmicpc.net/problem/31696)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

자료 구조, 분리 집합, 오프라인 쿼리

### 문제 설명

<p>Bajtocka wieś przechodzi modernizację. Celem najnowszego rządowego projektu jest dostarczanie komputer&oacute;w do tych mieszkańc&oacute;w wsi i małych miasteczek, kt&oacute;rzy ich nie posiadają. Bajtazar nadzoruje modernizację jednej z wsi objętych programem &ndash; Bajtoszyc &ndash; w kt&oacute;rej obecnie żaden mieszkaniec nie posiada komputera.</p>

<p>W Bajtoszycach mieszka n mieszkańc&oacute;w, kt&oacute;rych Bajtazar dla ułatwienia ponumerował liczbami całkowitymi od 1 do n. Na początku żaden z mieszkańc&oacute;w nie ma komputera. Zadaniem Bajtazara jest przetwarzać wydarzenia trzech postaci:</p>

<ul>
	<li>+ a<sub>i</sub> b<sub>i</sub> &ndash; Do mieszkańca Bajtoszyc zostaje dostarczony komputer. Bajtazar nie wie jednak, czy komputer zostaje dostarczony do mieszkańca o numerze a<sub>i</sub> czy b<sub>i</sub>. Może się zdarzyć, że a<sub>i</sub> = b<sub>i</sub> &ndash; wtedy komputer na pewno został dostarczony do mieszkańca o numerze a<sub>i</sub>. Pewnym jest, że komputer zostaje dostarczony do mieszkańca, kt&oacute;ry aktualnie go nie posiada.</li>
	<li>- c<sub>i</sub> &ndash; Mieszkańcowi o numerze c<sub>i</sub> psuje się komputer. Pewnym jest, że mieszkaniec ten posiadał dotychczas komputer (lecz teraz już nie będzie go miał, więc może w przyszłości otrzymać nowy).</li>
	<li>? d<sub>i</sub> &ndash; Bajtazar musi stwierdzić (korzystając z całej dostarczonej mu <strong>dotychczas</strong> wiedzy), czy mieszkaniec o numerze d<sub>i</sub>: na pewno posiada komputer, na pewno nie posiada komputera, czy też nie wiadomo, czy posiada komputer.</li>
</ul>

<p>Napisz program, kt&oacute;ry pomoże Bajtazarowi odpowiadać na zadawane mu pytania!</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite n oraz q (1 &le; n &le; 300 000; 1 &le; q &le; 1 000 000), oznaczające odpowiednio liczbę mieszkańc&oacute;w Bajtoszyc oraz liczbę wydarzeń, kt&oacute;re musi przetworzyć Bajtazar.</p>

<p>W kolejnych q wierszach znajdują się opisy kolejnych wydarzeń opisanych w treści zadania. We wszystkich wydarzeniach zachodzi 1 &le; a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub>, d<sub>i</sub> &le; n.</p>

<p>Gwarantowanym jest, że Bajtazar zostanie chociaż raz spytany o sw&oacute;j stan wiedzy, tzn. wejście zawiera przynajmniej jedno wydarzenie typu &lsquo;?&rsquo;. Gwarantowanym jest r&oacute;wnież, że istnieje przynajmniej jeden przebieg dostarczania komputer&oacute;w, w kt&oacute;rym komputer zawsze otrzymuje osoba, kt&oacute;ra aktualnie go nie posiada, i w kt&oacute;rym komputer zawsze psuje się osobie, kt&oacute;ra aktualnie go posiada.</p>

### 출력

<p>Na wyjściu powinien znaleźć się ciąg znak&oacute;w długości r&oacute;wnej liczbie wydarzeń typu &lsquo;?&rsquo;. Jeśli przy i-tym zapytaniu &oacute;w mieszkaniec na pewno posiada komputer, to i-ty znak w tym ciągu powinien być r&oacute;wny &lsquo;1&rsquo;. Jeśli mieszkaniec ten na pewno nie posiada komputera, to i-ty znak w tym ciągu powinien być r&oacute;wny &lsquo;0&rsquo;. Jeśli ten mieszkaniec może, ale nie musi posiadać komputera, to i-ty znak w tym ciągu powinien być r&oacute;wny &lsquo;?&rsquo;.</p>

### 힌트

<p>Wyjaśnienie przykładu: Na początku nikt nie posiada komputera, zatem odpowiedź na pierwsze pytanie jest przecząca, a pierwszym znakiem na wyjściu jest &lsquo;0&rsquo;. Następnie zostają dostarczone dwa komputery i jesteśmy pytani o to, czy drugi mieszkaniec posiada komputer. Jest możliwym, że jedna z dw&oacute;ch dotychczasowych dostaw była do niego, ale mogło się też zdarzyć, że komputery dostawali odpowiednio mieszkaniec pierwszy i trzeci. Nie jesteśmy zatem w stanie jednoznacznie stwierdzić czy drugi mieszkaniec posiada komputer, odpowiedzią jest więc &lsquo;?&rsquo;. Zwr&oacute;ć uwagę na to, że po następnej dostawie stanie się jasnym, że drugi mieszkaniec musiał już posiadać komputer, jednak w momencie zapytania Bajtazar nie m&oacute;gł tego wiedzieć.</p>