# [Gold V] Auhinnad - 29836

[문제 링크](https://www.acmicpc.net/problem/29836)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 17, 맞힌 사람: 16, 정답 비율: 76.190%

### 분류

브루트포스 알고리즘, 이분 탐색, 집합과 맵

### 문제 설명

<p>Kevinile on usaldatud &uuml;lesanne osta ol&uuml;mpiaadi l&otilde;ppvooru esikolmikule auhinnad. Selleks on tal kasutada $K$-eurone eelarve. Tal on ka nimekiri $N$ v&otilde;imaliku auhinna hindadega. Aita Kevinit ja &uuml;tle talle, kas tal on v&otilde;imalik osta $3$ erinevat auhinda nii, et eelarve oleks t&auml;pselt &auml;ra kasutatud.</p>

### 입력

<p>Sisendi esimesel real on kaks t&auml;isarvu $N$ ($3 \le N \le 10^4$) ja $K$ ($1 \le K \le 3 \cdot 10^8$), vastavalt v&otilde;imalike auhindade arv ja etteantud eelarve. Teisel real on $N$ t&auml;isarvu $A_1, A_2, \ldots, A_N$ ($0 \le A_i \le 10^8$), v&otilde;imalike auhindade hinnad (m&otilde;ned auhinnad on v&otilde;imalik saada tasuta).</p>

### 출력

<p>V&auml;ljastada s&otilde;na &#39;<code>JAH</code>&#39; (ilma jutum&auml;rkideta) kui on v&otilde;imalik valida kolm auhinda nii, et eelarve oleks t&auml;pselt kulutatud, ja s&otilde;na &#39;<code>EI</code>&#39; vastasel korral.</p>