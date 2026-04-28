# [Bronze III] Alien - 7782

[문제 링크](https://www.acmicpc.net/problem/7782)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 515, 정답: 415, 맞힌 사람: 375, 정답 비율: 81.699%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Once upon a time after winning another competition at KBTU, Bakhytzhan, Askar and Artem walked throw the Old Square. When they found some interesting rectangle lines on the asphalt, they stopped and screamed out &rdquo;R tree&rdquo;. They screamed so loud that all people around them screamed &rdquo;ALIENS&rdquo;. Bakhytzhan knew that these lines were resigned by aliens from the Moon which landed on the square the night before. Now they want to know is it true that some alien&rsquo;s ship landed on the place where Bakhytzhan stopped.</p>

### 입력

<p>The first line of the input file contains a single integer number n &ndash; the number of alien&rsquo;s ships (1 &le; n &le; 10 000). The second line of the input file contains a pair of integer numbers &ndash; Bakhytzhan&rsquo;s coordinates &ndash; b1 and b2 (&minus;10 000 &le; b1,b2 &le; 10 000). The following n lines describe n alien&rsquo;s ships. Each alien&rsquo;s ship is described by 2 pairs of integer coordinates: first pair lx and ly (&minus;10 000 &le; lx,ly &le; 10 000) describes bottom left corner of the ship and the second pair hx and hy (&minus;10 000 &le; hx,hy &le; 10 000) describes top right corner of the ship on a Cartesian plane.</p>

### 출력

<p>The output file must contain &rdquo;Yes&rdquo; if any alien&rsquo;s ship landed on the place where Bakhytzhan stopped, and &rdquo;No&rdquo; otherwise.</p>