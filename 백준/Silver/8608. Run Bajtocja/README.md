# [Silver V] Run Bajtocja - 8608

[문제 링크](https://www.acmicpc.net/problem/8608)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 98, 정답: 62, 맞힌 사람: 48, 정답 비율: 64.000%

### 분류

수학, 정수론, 임의 정밀도 / 큰 수 연산, 유클리드 호제법

### 문제 설명

<p>Kr&oacute;l Bajtocji dba o dobrą kondycję fizyczną swoich poddanych. Dlatego regularnie w stolicy organizowana jest masowa impreza sportowa - &quot;Run Bajtocja&quot;. Mieszkańcy kraju licznie stają na linii startu, aby wystartować do biegu. Biegacze nie mają do pokonania określonego dystansu, tylko rozpocząwszy bieg razem ze wsp&oacute;lnego startu, biegają po trasie będącej pętlą o długości 1 km do czasu, aż znowu wszyscy spotkają się razem w punkcie startu. Każdy z biegaczy chciałby wiedzieć, ile kilometr&oacute;w przebiegł w czasie wyścigu. Jednak ponieważ wyścig ten potrafi trwać bardzo długo, zawodnicy często zapominają ze zmęczenia, ile dokładnie przebiegli okrążeń, mimo że każdy z nich przebiega jedno okrążenie w stałym, znanym czasie.</p>

<p>Twoim zadaniem jest pom&oacute;c im dowiedzieć się, ile kilometr&oacute;w przebiegli.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>dla każdego z zawodnik&oacute;w wczyta ze standardowego wejścia czas, jaki potrzebuje on do przebycia jednego okrążenia,</li>
	<li>dla każdego zawodnika obliczy, ile kilometr&oacute;w przebiegł on w czasie wyścigu,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita $n$&nbsp;($1 &le; n &le; 100\,000$), oznaczająca liczbę zawodnik&oacute;w. W każdym z następnych $n$&nbsp;wierszy znajduje się jedna liczba całkowita $t_i$&nbsp;($1 &le; t_i &le; 500$, oznaczająca czas wyrażony w sekundach, w jakim zawodnik o numerze $i$&nbsp;przebiega jedno okrążenie.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście $n$&nbsp;wierszy. W $i$-tym z nich powinna znaleźć się jedna liczba całkowita $d_i$&nbsp;oznaczająca dystans przebyty przez $i$-tego zawodnika.</p>