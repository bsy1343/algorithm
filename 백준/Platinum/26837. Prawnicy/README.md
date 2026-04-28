# [Platinum IV] Prawnicy - 26837

[문제 링크](https://www.acmicpc.net/problem/26837)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 정렬

### 문제 설명

<p>Kancelaria prawnicza &bdquo;Bajtazar i synowie&rdquo; otrzymała właśnie zlecenie od bardzo ważnego klienta. Sprawa jest poważna, niecierpiąca zwłoki i wymaga, aby k prawnik&oacute;w spośr&oacute;d n zatrudnionych w kancelarii odbyło zebranie. Każdy prawnik ma sp&oacute;jny okres czasu, w kt&oacute;rym jest wolny (nie ma przewidzianych innych zajęć). Należy wybrać takich k prawnik&oacute;w, aby czas na przeprowadzenie zebrania (czyli czas, w kt&oacute;rym wszyscy oni są wolni) był możliwie jak najdłuższy.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera dwie liczby całkowite n i k (1 &le; k &le; n) oddzielone pojedynczym odstępem, oznaczające liczbę prawnik&oacute;w zatrudnionych w kancelarii oraz liczbę prawnik&oacute;w potrzebnych do odbycia zebrania. W kolejnych n wierszach zapisane są informacje o dostępności prawnik&oacute;w; i-ty z nich zawiera dwie liczby całkowite a<sub>i</sub> i b<sub>i</sub> (1 &le; a<sub>i</sub> &lt; b<sub>i</sub> &le; 10<sup>9</sup>) oddzielone pojedynczym odstępem, oznaczające, że i-ty prawnik jest wolny pomiędzy chwilą a<sub>i</sub> a chwilą b<sub>i</sub>.</p>

### 출력

<p>W pierwszym wierszu standardowego wyjścia należy wypisać liczbę całkowitą oznaczającą największą możliwą do uzyskania długość spotkania. Możesz założyć, że będzie można odbyć spotkanie o długości co najmniej 1. W drugim wierszu należy zapisać ciąg k liczb całkowitych oddzielonych pojedynczymi odstępami, zawierający numery prawnik&oacute;w, kt&oacute;rzy mają być na spotkaniu. Jeżeli jest więcej niż jedna poprawna odpowiedź, Tw&oacute;j program powinien wypisać dowolną z nich.</p>

### 제한

<ul>
	<li>n &le; 1 000 000</li>
</ul>

### 힌트

<p>Wyjaśnienie do przykładu: Najdłuższe możliwe zebranie trzech prawnik&oacute;w ma długość 4. Mogą w nim uczestniczyć prawnicy o numerach 1, 2 i 4. Trwa ono od chwili 4 do chwili 8. Inną, r&oacute;wnie dobrą możliwością jest zebranie prawnik&oacute;w o numerach 2, 4 i 5; trwałoby ono od chwili 5 do chwili 9.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d2a2c951-9eb3-434b-ab53-efdc4a556195/-/preview/" style="width: 300px; height: 108px;" /></p>