# [Gold I] Wireless - 6818

[문제 링크](https://www.acmicpc.net/problem/6818)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 14, 맞힌 사람: 13, 정답 비율: 39.394%

### 분류

기하학, 누적 합, 스위핑, 피타고라스 정리

### 문제 설명

<p>Bob is sitting at home with his computer. He would like to experience more social interaction, so he is planning a trip to a coffee shop with his computer.</p>

<p>Bob has lots of data about wireless networks and coffee shops in the city. In Bob&rsquo;s city, there is one coffee shop at every intersection of streets. Specifically, Bob happens to live in a city with M streets (1 &le; M &le; 30, 000) that run east and west, and N streets (1 &le; N &le; 1, 000) that run north and south. As an added benefit, the distance between consecutive parallel streets is 1 metre (it is a very compact city).</p>

<p>It also turns out that inside K (1 &le; K &le; 1, 000) of the coffee shops, there is a wireless network station. Each wireless network station will have a particular bitrate B (1 &le; B &le; 1, 000) and can reach R metres (1 &le; R &le; 30, 000) from the coffee shop. In other words, a wireless network station from one coffee shop forms a circle with radius R centered at that particular coffee shop. Moreover, if someone is at distance R, the wireless network would be available, but if someone is at a distance larger than R, they cannot access that wireless point.</p>

<p>You can assume that each coffee shop has at most one wireless network stationed in it, but that multiple wireless networks may be available while sitting in that one coffee shop, due to the proximity of other wireless network stations.</p>

<p>Bob has a special device in his computer that can use all of the available bitrates of as many wireless networks as he can connect to.</p>

<p>Bob would like to find out the maximum bitrate he can obtain, and how many coffee shops would have that maximum capacity.</p>

### 입력

<p>On the first line of input, you will be given the integer M, the number of east-west streets. On the second line of input, you will be given the integer N, the number of north-south streets. On the third line of input, you will be given the integer K, the number of coffee shops with a wireless network. On the next K lines, you will have 4 integers per line. The first integer x on each line represents the north-south street on which the coffee shop is located, where 1 &le; x &le; N. The second integer, y, on each line represents the east-west street on which the coffee shop is located, where 1 &le; y &le; M. The third integer, R, on each line represents the radius of the wireless network from this particular coffee shop. The fourth integer, B, on each line represents the bitrate of the wireless network from this particular coffee shop.</p>

### 출력

<p>The output will be two lines long. The first line of output will be the integer representing the maximum bitrate that can be obtained over all coffee shops. The second line of output will be the number of coffee shops where this maximum bitrate can be obtained.</p>

### 힌트

<p>In the figure below, notice that the five coffee shops/intersections marked with a dark circle have total bitrates of 12.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/64fc67bc-afc3-4427-a405-f34f014f2f05/-/preview/" style="width: 431px; height: 373px;" /></p>