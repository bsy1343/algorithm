# [Platinum I] Pionek - 26834

[문제 링크](https://www.acmicpc.net/problem/26834)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 167, 정답: 28, 맞힌 사람: 22, 정답 비율: 21.359%

### 분류

정렬, 기하학, 스위핑, 두 포인터, 각도 정렬

### 문제 설명

<p>W punkcie (0, 0) nieskończonej kratki stoi pionek. Pionek ma n dozwolonych ruch&oacute;w. Każdy z nich jest opisany za pomocą wektora o wsp&oacute;łrzędnych całkowitych. Pionek może każdy z ruch&oacute;w wykonać co najwyżej raz, w dowolnej kolejności. Wektory opisujące ruchy mogą się powtarzać i wtedy pionek może wykorzystać każdy z nich.</p>

<p>Naszym celem jest dostać się pionkiem do punktu położonego możliwie najdalej od punktu początkowego (w odległości euklidesowej). Jak daleko może on dotrzeć?</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną dodatnią liczbę całkowitą n oznaczającą liczbę możliwych ruch&oacute;w pionka. Każdy z kolejnych n wierszy zawiera dwie liczby całkowite x<sub>i</sub>, y<sub>i</sub> (&minus;10<sup>4</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>4</sup>) oddzielone pojedynczym odstępem i oznaczające wektor [x<sub>i</sub>, y<sub>i</sub>] opisujący możliwy ruch pionka.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście liczbę całkowitą oznaczającą kwadrat odległości od punktu (0, 0) do najdalszego punktu, do kt&oacute;rego może doskoczyć pionek.</p>

### 제한

<ul>
	<li>n &le; 200 000</li>
</ul>

### 힌트

<p>Wyjaśnienie do przykładu: Na rysunku przedstawiono rozwiązanie optymalne wykorzystujące ruchy opisane wektorami [0, 2], [3, 1] oraz [2, &minus;2]. Inne, r&oacute;wnie dobre rozwiązanie uzyskujemy za pomocą wektor&oacute;w [0, 2], [&minus;3, 1] oraz [&minus;2, &minus;2].</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26834.%E2%80%85Pionek/89a74132.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26834.%E2%80%85Pionek/89a74132.png" data-original-src="https://upload.acmicpc.net/b079cae2-1bc9-4d97-8cdf-61c0a6526172/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 201px; height: 150px;" /></p>