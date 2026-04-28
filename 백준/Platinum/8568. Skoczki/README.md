# [Platinum II] Skoczki - 8568

[문제 링크](https://www.acmicpc.net/problem/8568)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 61, 정답: 22, 맞힌 사람: 21, 정답 비율: 77.778%

### 분류

격자 그래프, 이분 매칭

### 문제 설명

<p>Dana jest szachownica o wymiarach <em>n</em> &times; <em>n</em>, z kt&oacute;rej usunięto pewną liczbę p&oacute;l. Należy wyznaczyć maksymalną liczbę skoczk&oacute;w (konik&oacute;w) szachowych, kt&oacute;re można ustawić na pozostałych polach szachownicy tak, żeby żadne dwa skoczki nie atakowały się nawzajem.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8568.%E2%80%85Skoczki/7a2cd257.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8568.%E2%80%85Skoczki/7a2cd257.png" data-original-src="https://upload.acmicpc.net/af771a5e-a23d-4b79-8dfb-fb7de17321f2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Rysunek 1: Skoczek umieszczony w polu S atakuje pola oznaczone przez x.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta opis szachownicy z usuniętymi polami ze standardowego wejścia,</li>
	<li>wyznaczy maksymalną liczbę wzajemnie nie atakujących się skoczk&oacute;w szachowych, kt&oacute;re można ustawić na tej szachownicy,</li>
	<li>zapisze wynik na standardowym wyjściu.</li>
</ul>

### 입력

<p>W pierwszym wierszu znajdują się dwie liczby całkowite <em>n</em>&nbsp;i&nbsp;<em>m</em>, gdzie 1 &le; <em>n</em> &le; 200, 0 &le; <em>m</em> &le; <em>n</em><sup>2</sup>. Liczba <em>n</em>&nbsp;oznacza rozmiar szachownicy, a <em>m</em>&nbsp;oznacza liczbę usuniętych p&oacute;l.</p>

<p>W każdym z kolejnych <em>m</em>&nbsp;wierszy jest zapisana para liczb naturalnych <em>x</em>&nbsp;i <em>y</em>, gdzie 1 &le; <em>x</em>, <em>y</em> &le; <em>n</em>, oddzielonych pojedynczym odstępem. Są to wsp&oacute;łrzędne usuniętych p&oacute;l. Lewy g&oacute;rny r&oacute;g szachownicy ma wsp&oacute;łrzędne (1, 1), natomiast prawy dolny r&oacute;g ma wsp&oacute;łrzędne (<em>n</em>, <em>n</em>). Pola nie powtarzają się.</p>

### 출력

<p>Na standardowym wyjściu należy zapisać dokładnie jeden wiersz, zawierający pojedynczą liczbę całkowitą r&oacute;wną maksymalnej liczbie wzajemnie nie atakujących się skoczk&oacute;w, kt&oacute;re można ustawić na zadanej szachownicy.</p>