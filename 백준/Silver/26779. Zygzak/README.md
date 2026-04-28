# [Silver IV] Zygzak - 26779

[문제 링크](https://www.acmicpc.net/problem/26779)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 26, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

수학, 구현, 정수론, 시뮬레이션, 유클리드 호제법

### 문제 설명

<p>Bajtosia ma sw&oacute;j ulubiony ułamek zwykły p/q , gdzie p oraz q są liczbami całkowitymi dodatnimi. Ułamek Bajtosi niekoniecznie jest ułamkiem w postaci skr&oacute;conej, może to być ułamek 1 2 , 4 8 , lub 6 4 . Na kartce w kratkę narysowała (wzdłuż linii kratek) prostokąt o wysokości p i szerokości q. W tym prostokącie narysowała przekątną od lewego dolnego rogu do prawego g&oacute;rnego rogu. Następnie, r&oacute;wnież od lewego dolnego rogu do prawego g&oacute;rnego rogu, poprowadziła zygzak pod narysowaną przekątną, przesuwając oł&oacute;wek w prawo lub do g&oacute;ry wzdłuż linii kratek. Zygzak musi przez cały czas biec jak najwyżej to możliwe, jednak nigdy nie powinien przekraczać przekątnej (choć może jej dotykać). Innymi słowy: Bajtosia zawsze rysuje kreskę w g&oacute;rę, o ile nie przekracza w ten spos&oacute;b przekątnej. Jeżeli kreska przekroczyłaby przekątną, wtedy rysuje kreskę w prawo.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26779.%E2%80%85Zygzak/198ec7c0.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/26779.%E2%80%85Zygzak/198ec7c0.png" data-original-src="https://upload.acmicpc.net/dd6c67b7-54e6-4618-b7b7-07f56eb654c5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 501px; height: 87px;" /></p>

<p style="text-align: center;">Rysunki powyżej przedstawiają przykładową sytuację, gdy ułamkiem Bajtosi jest 2/3. Po lewej stronie mamy prostokąt o wysokości 2 i szerokości 3. Środkowy rysunek ma narysowaną przekątną (linią przerywaną). Rysunek po prawej ma zaznaczony odpowiadający zygzak.</p>

<p>Bajtosia trochę się wstydzi pokazać Ci sw&oacute;j rysunek (nie chce nawet zdradzić swojego ułamka!), dop&oacute;ki nie jest pewna, że narysowała go prawidłowo. Poda Ci zatem tylko kolejne ruchy oł&oacute;wka, kt&oacute;re wykonywała podczas rysowania (od lewego dolnego rogu prostokąta) jako ciąg znak&oacute;w <code>P</code> (kreska w prawo) i <code>G</code> (kreska do g&oacute;ry).</p>

<p>Twoim zadaniem jest napisać program, kt&oacute;ry wczyta opis zygzaka i powie, czy rysunek Bajtosi jest prawidłowy. Jeśli tak &ndash; program powinien wyznaczyć postać nieskracalną ułamka Bajtosi i wypisać wynik na standardowe wyjście.</p>

### 입력

<p>W pierwszym (jedynym) wierszu wejścia znajduje się niepusty napis złożony jedynie z liter <code>P</code> i <code>G</code> opisujący zygzak Bajtosi. Napis ten zawiera co najmniej jedną literę <code>P</code> oraz co najmniej jedną literę <code>G</code>.</p>

<p>Długość napisu nie przekracza 1 000 000 znak&oacute;w.</p>

### 출력

<p>Jeśli napis Bajtosi nie jest prawidłowym rysunkiem żadnego ułamka, należy wypisać na wyjście tylko jedno słowo <code>NIE</code>. Jeśli zaś jest prawidłowy, to w pierwszym (jedynym) wierszu wyjścia powinny się znaleźć dwie liczby całkowite, odpowiednio licznik i mianownik ułamka Bajtosi, oddzielone znakiem /, bez żadnych odstęp&oacute;w.</p>

<p>Ułamek musi być wypisany w postaci nieskracalnej, nawet jeżeli pierwotnie nie był w takiej postaci.</p>