# [Platinum IV] Sabotaż - 26842

[문제 링크](https://www.acmicpc.net/problem/26842)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 19, 맞힌 사람: 14, 정답 비율: 53.846%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>W pewnej organizacji, kt&oacute;rej nazwy nie możemy wymienić, relację przełożony-podwładny daje się przedstawić za pomocą drzewa &ndash; każdy pracownik, opr&oacute;cz szefa, ma dokładnie jednego bezpośredniego przełożonego. Ponadto pracownikom nadawane są numery w kolejności, w jakiej są zatrudniani, a przełożony ma zawsze wcześniejszy numer od podwładnego.</p>

<p>Rada nadzorcza obawia się, że w szeregi organizacji m&oacute;gł przeniknąć sabotażysta, chcący doprowadzić do buntu pracownik&oacute;w. Aby temu przeciwdziałać, rada jest zainteresowana utrzymywaniem wśr&oacute;d pracownik&oacute;w wysokiego morale (np. poprzez przyznawanie im dodatkowych premii, organizację festyn&oacute;w, czy zakup stoł&oacute;w do piłkarzyk&oacute;w). Morale wyraża się liczbą rzeczywistą x z zakresu od 0 do 1. Jeśli kt&oacute;rykolwiek pracownik zauważy, że frakcja powyżej x spośr&oacute;d jego (bezpośrednich oraz pośrednich) podwładnych zbuntowała się, to sam dołączy do buntu i zmusi do tego wszystkich swoich podwładnych. Sabotażysta jest jednym z pracownik&oacute;w i w pewnym momencie ujawni się, buntując się jako pierwszy (ale nie zmusi do buntu swoich podwładnych).</p>

<p>Rada nadzorcza chce wiedzieć, jakie jest najmniejsze morale, kt&oacute;re musi być utrzymane wśr&oacute;d pracownik&oacute;w, żeby potencjalny bunt m&oacute;gł objąć co najwyżej k pracownik&oacute;w. Napisz program, kt&oacute;ry wyznaczy tę liczbę.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera dwie liczby całkowite n i k (1 &le; k &le; n &le; 500 000) oddzielone pojedynczym odstępem, oznaczające liczbę pracownik&oacute;w organizacji i maksymalną dopuszczalną liczbę zbuntowanych. Pracownicy są ponumerowani liczbami całkowitymi od 1 do n, przy czym szef ma numer 1. Kolejne n &minus; 1 wierszy opisuje strukturę organizacyjną: i-ty z tych wierszy zawiera liczbę całkowitą p<sub>i</sub> (p<sub>i</sub> &le; i) oznaczającą, że bezpośrednim przełożonym pracownika o numerze i + 1 jest pracownik o numerze p<sub>i</sub>.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę rzeczywistą, oznaczającą szukane morale. Wyniki r&oacute;żniące się od prawidłowego o mniej niż 10<sup>&minus;6</sup> będą uznane za poprawne.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26842.%E2%80%85Sabota%C5%BC/e2ceeb97.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26842.%E2%80%85Sabota%C5%BC/e2ceeb97.png" data-original-src="https://upload.acmicpc.net/3f6800f1-8bde-4805-8faf-010be030ffe2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 128px;" /></p>

<p>Wyjaśnienie do przykładu: Spadek morale poniżej 2/3 grozi tym, że jeśli sabotażystą jest pracownik numer 8, to spowoduje on bunt 4 pracownik&oacute;w (o numerach 3, 7, 8 i 9).</p>