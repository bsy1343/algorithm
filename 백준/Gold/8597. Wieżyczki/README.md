# [Gold II] Wieżyczki - 8597

[문제 링크](https://www.acmicpc.net/problem/8597)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 3, 맞힌 사람: 3, 정답 비율: 18.750%

### 분류

누적 합

### 문제 설명

<p>Jaś ułożył z klock&oacute;w wieżyczki o r&oacute;żnych wysokościach. Na każdym klocku jest zapisana pewna liczba całkowita. Wieżyczka jest tym bardziej wartościowa, im większą sumę posiadają klocki do niej należące. Jaś chciałby zbudować najbardziej wartościową wieżyczkę, jednak nie chce całkowicie niszczyć zbudowanych już wieżyczek. Dlatego postanowił, że jedyne, co może zrobić, to wybrać dwie wieżyczki r&oacute;żnych wysokości i:</p>

<ul>
	<li>z większej zdjąć dokładnie tyle klock&oacute;w, z ilu zbudowana jest mniejsza wieżyczka, i stworzyć z nich nową wieżyczkę (przy tworzeniu wieżyczki Jaś nie zmienia kolejności klock&oacute;w);</li>
	<li>następnie na wieżyczkę, z kt&oacute;rej zdejmował klocki, postawić drugą wieżyczkę.</li>
</ul>

<p>W ten spos&oacute;b powstaną dwie wieżyczki o tych samych wysokościach co poprzednio, ale być może o innych liczbach na poszczeg&oacute;lnych klockach (patrz rysunek).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8597.%E2%80%85Wie%C5%BCyczki/09267ec8.png" data-original-src="https://upload.acmicpc.net/48703d11-6692-478e-a494-21549d4e323d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p align="center">Rysunek: Przebieg ruchu Jasia dla wieżyczek (4, 5, 7, 1) i (3, 6).</p>

<p>Jaś chciałby znać maksymalną wartość wieżyczki, jaką może zbudować.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita $n$&nbsp;($1 &le; n &le; 500\,000$), oznaczająca liczbę wieżyczek, kt&oacute;re zbudował Jaś. W $n$&nbsp;kolejnych wierszach znajduje się opis kolejnych wieżyczek. W $(i+1)$-szym wierszu znajduje się liczba całkowita $w_i$&nbsp;($1 &le; w_i &le; 1\,000\,000$), oznaczająca wysokość $i$-tej wieżyczki, oraz następnie $w_i$&nbsp;liczb całkowitych $x_1, x_2, \dots , x_{w_i}$&nbsp;($-1\,000\,000 &le; x_k &le; 1\,000\,000$), przy czym $x_k$&nbsp;oznacza liczbę znajdującą się na $k$-tym od g&oacute;ry klocku $k$-tej wieżyczki. Możesz założyć, że łączna liczba klock&oacute;w $K$, z kt&oacute;rych zbudowane są wszystkie wieżyczki, nie przekracza $1\,000\,000$.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście jedną liczbę całkowitą, oznaczającą maksymalną wartość wieżyczki, jaką może zbudować Jaś.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8597.%E2%80%85Wie%C5%BCyczki/946d6150.png" data-original-src="https://upload.acmicpc.net/4182691e-2233-4248-8594-98de7ecc7451/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p><b>Wyjaśnienie:</b>&nbsp;Jaś może zbudować z wieżyczek nr 2 i nr 3 wieżyczkę (4, 6), a następnie z tej wieżyczki i wieżyczki nr 1 zbudować wieżyczkę (4, 6, 7, 1) o wartości 18.</p>