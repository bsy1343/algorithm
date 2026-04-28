# [Platinum V] Screamers in the Storm - 23788

[문제 링크](https://www.acmicpc.net/problem/23788)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 40, 정답: 25, 맞힌 사람: 24, 정답 비율: 75.000%

### 분류

수학, 정수론, 분할 정복을 이용한 거듭제곱, 유클리드 호제법

### 문제 설명

<p>On Mars, though its atmosphere is very thin, winds can blow with unexpected force. The effect can grow even stronger in narrow and deep canyons close to the equator. The floor of one of these canyons is extremely flat and it is used for transport because its steep walls provide partial shielding from cosmic radiation. Over the time, sand has accumulated in the canyon. It is blown by the wind into sizeable sand dunes which obstruct the transport. The dunes form one long string of dunes stretched along the canyon floor.</p>

<p>The arrangement of the dunes is not stable. Raging sand storms often remodel the dunes into a different string. Violent movement of sand masses in the storm produce an eerie sound for which the dunes are known as &rdquo;Screamers in the storm&rdquo;.</p>

<p>Detailed measurements of the dunes revealed that the height of adjacent dunes, expressed in Martian meters, is always a small positive integer. Moreover, probably due to wind interference effects in the canyon, the heights of two adjacent dunes are different, unless they are both 1. In fact, the heights of two adjacent dunes are always relatively prime, that is, they share no common factor bigger than 1.</p>

<p>To model the dunes behavior, the number of all possible configurations of the dunes in the string has to be established.</p>

### 입력

<p>The input contains one line with two integers K, N (1 &le; K &le; 66, 1 &le; N &le; 10<sup>18</sup>), the maximum possible height of a dune and the number of dunes in the string of dunes.</p>

### 출력

<p>Print the number of different strings of dunes. Output the result modulo 10<sup>9</sup> + 7.</p>