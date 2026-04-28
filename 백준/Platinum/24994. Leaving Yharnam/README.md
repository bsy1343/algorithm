# [Platinum I] Leaving Yharnam - 24994

[문제 링크](https://www.acmicpc.net/problem/24994)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 15, 맞힌 사람: 14, 정답 비율: 42.424%

### 분류

수학, 구현, 정수론, 조합론, 많은 조건 분기, 모듈로 곱셈 역원

### 문제 설명

<p>Eileen works for the municipal bus company in a city called Yharnam. As a classic overachiever, she always wants to assure the passengers are as happy as they can be, which wasn&rsquo;t very hard since there were not many people wanting to leave the great city. Recently, though, there have been some crazy diseases appearing in town, and many citizens of Yharnam have decided to leave. By bus, of course.</p>

<p>Each bus in Yharnam is formed by pairs of seats. Each pair is formed by two seats: the window seat, and the aisle seat. These two seats are considered to be next to each other. Each seat can be empty, which means no one is sitting on it, or full, which means someone is sitting on it.</p>

<p>Some people prefer the seat next to theirs to be empty. Some people like having people to talk to, so they would rather have the seat next to theirs to be full. Some people are just really happy to be leaving Yharnam. Thus, when it comes to happiness in sitting on a bus, there are three types of people:</p>

<ul>
	<li><em>introvert</em>: an introvert is happy if they get a spot in the bus and the seat next to them is empty;</li>
	<li><em>extrovert</em>: an extrovert is happy if they get a spot in the bus and the seat next to them is full;</li>
	<li><em>easygoing</em>: an easygoing person is happy as long as they get a spot in the bus.</li>
</ul>

<p>The order in which people board a bus is determined beforehand. While boarding, each person selects a seat and seats on it before the next person is allowed to choose. Once someone has chosen a seat, they can&rsquo;t change it. The introverts avoid as much as possible sitting next to another introvert since they know the struggle. Other than that, every person proceeds in a similar way when selecting a seat:</p>

<ul>
	<li>If there is any empty seat that makes them happy, the person selects one of those seats uniformly at random.</li>
	<li>If there is any empty seat but none of them makes them happy, an extrovert selects one empty seat uniformly at random, while an introvert selects one seat uniformly at random among the empty seats that aren&rsquo;t next to introverts, or among all empty seats in case all the empty seats are next to introverts. Note that this cannot happen to an easygoing person.</li>
	<li>If there are no empty seats, the person leaves the bus grumbling.</li>
</ul>

<p>Eileen defines the happiness of a bus as the number of happy passengers in it when the bus is ready to go, that is, after either everyone has boarded or there are no empty seats. With more buses leaving Yharnam and more passengers in those buses, guaranteeing the happiness of everyone has become harder than ever.</p>

<p>Eileen&rsquo;s current strategy to maximize the number of happy passengers is to let all easygoing people board first, then all extroverts, and finally the introverts. She explains her strategy as follows: first let the chaotic and easy to please easygoing people find their way on the bus, then let the extroverts make themselves happy by seating close to either an easygoing person or another extrovert, and finally let some lucky introverts look for a peaceful seat. Although Eileen&rsquo;s strategy is sensible, the trip ratings received from the passengers are showing a downward trend. That&rsquo;s why she came to you asking for help.</p>

<p>Before making any changes to the way the passengers board the bus, Eileen wants to better understand her current approach. A bus formed by N pairs of seats is about to leave Yharnam.&nbsp;Eileen knows that G easygoing people, I introverts, and E extroverts are ready to board. She wants to know the expected happiness of the bus, given that the easygoing people board first, followed by the extroverts, and finally the introverts.</p>

### 입력

<p>The input consists of a single line that contains four integers N, G, I and E (0 &le; N, G, I, E &le; 10<sup>6</sup>), as described in the statement.</p>

### 출력

<p>The expected happiness of the bus can be expressed as an irreducible fraction P/Q. Output the remainder of dividing P &times; Q&#39; by 10<sup>9</sup> + 7, where Q&#39;&nbsp;is the modular multiplicative inverse of Q, that is, Q &times; Q&#39; &equiv; 1 (mod 10<sup>9</sup> + 7).</p>