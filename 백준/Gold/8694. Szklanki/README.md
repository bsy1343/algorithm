# [Gold I] Szklanki - 8694

[문제 링크](https://www.acmicpc.net/problem/8694)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 16, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

수학, 누적 합

### 문제 설명

<p>Bitoasia ustawiła pewną liczbę szklanek w rzędzie i do każdej nalała tyle samo wody, następnie wyszła do łazienki. W tym czasie do pokoju ze szklankami przyszedł Bajtokozik i postanowił zrobić Bitoasi psikusa - szybko poprzelewał wodę między szklankami.</p>

<p>Gdy Bitoasia wr&oacute;ciła i zobaczyła, że w szklankach jest nier&oacute;wnomierna ilość wody, to bardzo się zdenerwowała i pobiegła rozpłakana do Bitomamy. Jednak, po przeprowadzeniu dochodzenia, Bitomama Bitoasi nie znalazła sprawcy. Nie pozostało więc nic innego, jak przelać wodą ze szklanek tak, aby w każdej była taka sama ilość wody.</p>

<p>Bitoasia chce wykonać jak najmniejszą liczbę ruch&oacute;w, aby zbytnio się nie zmęczyć. Pojedynczy ruch polega na wzięciu dowolnej szklanki i przelaniu wody do szklanki&nbsp;<b>sąsiedniej</b>&nbsp;(z lewej bądź prawej strony). Stwierdź, ile minimalnie ruch&oacute;w musi wykonać Bitoasia.</p>

<p>Zakładamy, że pojedyncza szklanka może pomieścić całą wodę ze wszystkich szklanek. Wiemy, że na początku w każdej szklance była r&oacute;wnomierna ilość wody, kt&oacute;rej liczba jednostek była liczbą całkowitą. Bajtokozik podczas przelewania nie wylał żadnej kropli poza szklankę oraz żadna kropla nie wyparowała.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczającą liczbę szklanek ustawionych w rzędzie. Następny wiersz wejścia zawiera&nbsp;<em>n</em>&nbsp;liczb całkowitych <em>w</em><sub>1</sub>, <em>w</em><sub>2</sub>, ..., <em>w<sub>n</sub></em>&nbsp;(1 &le; <em>w<sub>i</sub></em> &le; 10<sup>6</sup>), gdzie&nbsp;<em>w<sub>i</sub></em>&nbsp;oznacza liczbę jednostek wody znajdującej się w <em>i</em>-tej szklance (po psikusie Bajtokozika).</p>

### 출력

<p>Pierwszy wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną minimalnej liczbie ruch&oacute;w, jakie może wykonać Bitoasia.</p>