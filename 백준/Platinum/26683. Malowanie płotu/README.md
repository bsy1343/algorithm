# [Platinum II] Malowanie płotu - 26683

[문제 링크](https://www.acmicpc.net/problem/26683)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

수학, 다이나믹 프로그래밍, 누적 합, 조합론

### 문제 설명

<p>Tegoroczna jesienna słota zupełnie zniszczyła farbę na płocie pana Potyczka. Trzeba czym prędzej pokryć płot specjalnym niebieskim impregnatem, żeby nadchodząca zima nie zrujnowała go nieodwracalnie. Pan Potyczek poprosił o to pracowitego synka sąsiad&oacute;w o imieniu Bajtek. Chłopiec dziś rano wykonał zadanie, jednak zrobił to dość niedbale, gdyż śpieszył się na kolejną rundę Szranek Algorytmicznych.</p>

<p>Płot pana Potyczka składa się z n sztachet, a każda sztacheta podzielona jest na m r&oacute;wnej długości segment&oacute;w. Bajtek każdą sztachetę pociągnął farbą od g&oacute;ry do dołu tylko raz, co niestety mogło nie wystarczyć, żeby pomalować ją w całości. Niemniej jednak, na każdej sztachecie pomalowany został sp&oacute;jny przedział segment&oacute;w, a każdy segment został albo całkowicie pomalowany albo niepomalowany wcale. Okazało się ponadto, że część płotu pomalowana przez chłopca jest sp&oacute;jna, tzn. dla każdych dw&oacute;ch kolejnych sztachet przedziały segment&oacute;w pomalowane na nich mają niepuste przecięcie.</p>

<p>Przykładowo, pomalowany płot może wyglądać następująco:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26683.%E2%80%85Malowanie%E2%80%85p%C5%82otu/a40bffa9.png" data-original-src="https://upload.acmicpc.net/2d387bf2-b4cd-4fb1-b93a-6ee615d8da86/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 188px; height: 101px;" /></p>

<p>Natomiast poniższa sytuacja jest niemożliwa z trzech r&oacute;żnych powod&oacute;w:</p>

<ul>
	<li>Sztacheta numer 1 nie została w og&oacute;le pomalowana.</li>
	<li>Na sztachecie numer 3 nie został pomalowany sp&oacute;jny fragment.</li>
	<li>Przedziały segment&oacute;w pomalowane na sztachetach o numerach 5 i 6 są rozłączne.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26683.%E2%80%85Malowanie%E2%80%85p%C5%82otu/692280bb.png" data-original-src="https://upload.acmicpc.net/0643dd29-a0d6-4003-ab53-f73112821ede/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 188px; height: 101px;" /></p>

<p>Napisz program, kt&oacute;ry obliczy, na ile r&oacute;żnych sposob&oacute;w Bajtek m&oacute;gł pomalować płot zgodnie z powyższymi zasadami. Dwa sposoby uznajemy za r&oacute;żne, jeśli istnieje segment sztachety pomalowany w jednym z nich i niepomalowany w drugim. Liczba sposob&oacute;w może być dość duża, więc wystarczy że podasz jej resztę z dzielenia przez liczbę pierwszą p.</p>

### 입력

<p>W pierwszym i jedynym wierszu wejścia znajdują się trzy dodatnie liczby całkowite n, m oraz p (1 &le; n&middot;m &le; 10<sup>7</sup>, 10<sup>8</sup> &le; p &le; 10<sup>9</sup> , p &isin; P) oznaczające odpowiednio liczbę sztachet, liczbę segment&oacute;w na każdej sztachecie oraz liczbę pierwszą p.</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba całkowita oznaczająca resztę z dzielenia przez p liczby r&oacute;żnych sposob&oacute;w, na jakie Bajtek m&oacute;gł pomalować płot.</p>