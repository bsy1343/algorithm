# [Gold II] Waga - 8605

[문제 링크](https://www.acmicpc.net/problem/8605)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 4, 맞힌 사람: 4, 정답 비율: 26.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Mały Bajtek dostał od rodzic&oacute;w interesującą zabawkę. Składa się ona z wagi szalkowej oraz odważnik&oacute;w w postaci cegiełek. Niekt&oacute;re z nich są magiczne i mają ujemne wagi. Za pomocą tej zabawki Bajtek wyznaczał wagi przer&oacute;żnych przedmiot&oacute;w. Jednak taka zabawa szybko mu się znudziła, więc wymyślił następującą grę.</p>

<p>Gra zaczyna się od ustawienia cegiełek na obu szalkach wagi, tak aby utworzyły pewną liczbę wież, z kt&oacute;rych każda składa się z dokładnie $n$&nbsp;cegiełek. Następnie Bajtek pr&oacute;buje w jak najmniejszej liczbie ruch&oacute;w zr&oacute;wnoważyć wagę. Jedyna czynność, jaką może wykonywać, to usunięcie cegiełki z wierzchołka dowolnej wieży.</p>

<p>Bajtkowi bardzo spodobała się ta gra, lecz zauważył, że nie potrafi stwierdzić, czy jego rozwiązanie składa się z minimalnej liczby ruch&oacute;w. Napisz program, kt&oacute;ry wyznaczy najmniejszą liczbę ruch&oacute;w umożliwiającą zr&oacute;wnoważenie wagi, by Bajtek m&oacute;gł zweryfikować swoje umiejętności w wymyślonej przez siebie grze.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się trzy liczby całkowite $n$, $l$&nbsp;oraz $p$&nbsp;($1 &le; n &le; 50$, $1 &le; l, p &le; 25$), pooddzielane pojedynczymi odstępami, oznaczające odpowiednio liczbę cegiełek, z kt&oacute;rych składa się każda wieża, liczbę wież na lewej szalce oraz liczbę wież na prawej szalce. W każdym z następnych $l$&nbsp;wierszy znajduje się opis jednej spośr&oacute;d wież na lewej szalce. Każdy taki opis składa się z $n$&nbsp;liczb całkowitych $w_{k,i}$&nbsp;($-50 &le; w_{k,i} &le; 50$) pooddzielanych pojedynczymi odstępami, oznaczających wagi kolejnych cegiełek&nbsp;<img src="%EB%B0%B1%EC%A4%80/Gold/8605.%E2%80%85Waga/ca81098c.jpg" data-original-src="https://boja.mercury.kr/assets/problem/8605-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" />-tej wieży, począwszy od jej spodu do wierzchołka. W kolejnych $p$&nbsp;wierszach znajduje się opis wież na prawej szalce, w takim samym formacie.</p>

### 출력

<p>W pierwszym i jedynym wierszu standardowego wyjścia Tw&oacute;j program powinien wypisać jedną liczbę całkowitą, oznaczającą minimalną liczbę ruch&oacute;w potrzebnych do zr&oacute;wnoważenia wagi.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8605.%E2%80%85Waga/b073237a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8605.%E2%80%85Waga/b073237a.png" data-original-src="https://upload.acmicpc.net/73604a03-bd4f-4bf0-a75b-df43cd0c1008/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;Suma wag cegiełek na lewej szalce jest r&oacute;wna 8, a na prawej 9. Aby zr&oacute;wnoważyć szalki, Bajtek może zdjąć po jednej cegiełce z drugiej wieży na lewej szalce i z pierwszej wieży na prawej szalce; w&oacute;wczas obciążenie szalek wyniesie&nbsp;$3 + 4 + (-1) = 6 = 7 + (-2) + 1$.</p>