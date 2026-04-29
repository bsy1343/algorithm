# [Platinum III] Joy of Pokémon Observation - 33024

[문제 링크](https://www.acmicpc.net/problem/33024)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 21, 정답: 18, 맞힌 사람: 17, 정답 비율: 94.444%

### 분류

수학, 정수론

### 문제 설명

<p>The Pokémon Conservation Society protects Pokémon and their habitats all around the globe. In recent research, data about $h$ habitats was collected.</p>

<p>Each habitat may be inhabited by several Pokémon species. Researchers know how many limbs each species has. Pokémon are swift and extremely good at hiding, so researchers were only able to detect the total number of limbs in each of the habitats.</p>

<p>Researchers understand that it might not be possible to find the population of each species, but would like to understand how much uncertainty is left. How many different combinations of Pokémon would have the observed number of limbs?</p>

### 입력

<p>The first line contains a single integer $h$ ($1 \le h \le 1\,024$) --- the number of habitats. The next $h$ lines contain the description of each habitat.</p>

<p>Each line starts with two integers $t$ and $s$ ($0 \le t \le 10^9$, $1 \le s \le 3$), where $t$ is the total number of limbs, and $s$ is the number of species in the habitat. They are followed by $s$ integers $l_i$ ($1 \le l_i \le 16$) --- the number of limbs for each species.</p>

### 출력

<p>Output the number of possible combinations of Pokémon in each habitat. Output should contain $h$ lines with a single integer.</p>