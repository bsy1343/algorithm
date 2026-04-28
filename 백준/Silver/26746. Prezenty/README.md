# [Silver V] Prezenty - 26746

[문제 링크](https://www.acmicpc.net/problem/26746)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 30, 맞힌 사람: 27, 정답 비율: 79.412%

### 분류

수학, 애드 혹

### 문제 설명

<p>Bajtosia i Bajtek przygotowują mikołajkowe prezenty dla uczni&oacute;w swojej szkoły. Wsp&oacute;lnie stwierdzili, że najlepszym (niekoniecznie dla zęb&oacute;w) prezentem będzie dużo cukierk&oacute;w. Bajtek kupił N pakunk&oacute;w z cukierkami, zawierających kolejno 1, 2, . . . , N cukierk&oacute;w.</p>

<p>Bajtosia chce rozdzielić wszystkie cukierki między jak największą liczbę dzieci, ale nie podoba się jej pomysł, żeby otwierać pakunki (kto by chciał dostać otwarty prezent?) ani pomysł, że niekt&oacute;rzy uczniowie mogliby dostać inną liczbę cukierk&oacute;w niż inni. Jedna osoba może jednak dostać kilka r&oacute;żnych pakunk&oacute;w.</p>

<p>Czy możesz pom&oacute;c? Napisz program, kt&oacute;ry wyznaczy największą liczbę uczni&oacute;w, między kt&oacute;rych można podzielić wszystkie pakunki tak, aby każdy dostał po tyle samo cukierk&oacute;w.</p>

### 입력

<p>W pierwszym (jedynym) wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 200 000) określająca liczbę pakunk&oacute;w przygotowanych przez Bajtka.</p>

### 출력

<p>W pierwszym wierszu wyjścia powinna się znaleźć jedna liczba naturalna R: największa liczba dzieci, kt&oacute;re mogą być obdarowane prezentami. W kolejnych R wierszach należy wypisać opis prezent&oacute;w dla kolejnych dzieci, po jednym w wierszu. Opis prezent&oacute;w dla kolejnych dzieci powinien się składać z liczby naturalnej R<sub>i</sub> określającej liczbę pakunk&oacute;w, kt&oacute;re otrzyma i-te dziecko, pojedynczego odstępu oraz ciągu R<sub>i</sub> liczb naturalnych opisujących liczby cukierk&oacute;w w pakunkach przypisanych prezentowi dla i-tego dziecka. Jeśli istnieje wiele możliwych rozwiązań, Tw&oacute;j program może wypisać dowolne z nich.</p>