# [Silver II] Travel the Skies - 16514

[문제 링크](https://www.acmicpc.net/problem/16514)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 24, 맞힌 사람: 22, 정답 비율: 91.667%

### 분류

구현, 그래프 이론, 시뮬레이션

### 문제 설명

<p>One day your boss explains his new planning scheme for your company, Fly Away Air. Rather than having customers book tickets between destinations, they&rsquo;ll say when they want to leave and from where, and your company will take care of the rest. That means you get to generate their flight schedules and destinations for them! He has an eye on the books though and wants to make sure all your flights are fully booked. He tasks you with the job of determining if a set of flight plans in a given flight window is financially optimal in that regard.</p>

<p>You assure him that he put his trust&mdash;and his pocket book&mdash;in the hands of the right employee. Your job is to plan flight schedules for customers so that you fill each of the flights scheduled in the given flight window. To ensure you don&rsquo;t lose customers due to air sickness, you decide that each customer can only take one flight a day. Further, since you&rsquo;re sure that all of your customers are gracious folks, you decide to help your boss out and let them fly on any day on or after their suggested departure date. Finally, to simplify things, you do not worry about ensuring each customer return to their original departure airport, though this is allowed to be scheduled. If needed, they can book their own return flights!</p>

### 입력

<p>On the first line, you&rsquo;re given three integers: k, (2 &le; k &le; 12), the number of airports; n, (1 &le; n &le; 8), the number of days of the flight departure window; and m, (1 &le; m &le; k &middot; (k &minus; 1) &middot; n); the number of flights in the window. Then, m lines follow with four integers each: u, (1 &le; u &le; k), the flight&rsquo;s starting location; v, (1 &le; v &le; k, u 6= v), the flight&rsquo;s ending destination; d, (1 &le; d &le; n), the day on which the flight flies in the window; and z, (1 &le; z &le; 30 000), the capacity of the flight. It is guaranteed there will be at most one flight in each direction between any two airports on a given day. Following are kn lines with three integers each: a, (1 &le; a &le; k), the airport; b, (1 &le; b &le; n), the day; and c, (1 &le; c &le; 30 000), the number of customers wishing to begin their travels by leaving their homes to their local airport a on day b (notably, this does not include those who may be arriving from other flights, which is for you to decide). Each airport-day pair will appear exactly once.</p>

### 출력

<p>Output only the word optimal if all m flights can be filled to capacity, else output only the word suboptimal if it is not possible to fill all m flights. It is not necessary that each customer arriving at an airport ever be booked on a flight.</p>