# [Silver I] Nicole - 10697

[문제 링크](https://www.acmicpc.net/problem/10697)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 55, 정답: 19, 맞힌 사람: 16, 정답 비율: 33.333%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Nicole Hosh (a media core team and Fegla&rsquo;s best friend ever) is an avid reader of scientific material, especially physics and astronomy which led her to know much about the special properties of ellipses and the results of incorporating them in different structures. One of these properties is that of elliptic halls; it goes as follows, according to wikipedia:</p>

<p>&ldquo;In a large elliptical room a person standing at one focus can hear a person standing at the other focus remarkably well. The effect is even more evident under a vaulted roof shaped as a section of a prolate spheroid. Such a room is called a whisper chamber. The same effect can be demonstrated with two reflectors shaped like the end caps of such a spheroid, placed facing each other at the proper distance. Examples are the National Statuary Hall at the United States Capitol (where John Quincy Adams is said to have used this property for eavesdropping on political matters); the Mormon Tabernacle at Temple Square in Salt Lake City, Utah; at an exhibit on sound at the Museum of Science and Industry in Chicago; in front of the University of Illinois at Urbana-Champaign Foellinger Auditorium; and also at a side chamber of the Palace of Charles V, in the Alhambra.&rdquo;[sic]</p>

<p>Nicole has noticed that in one of the national contests, the contest hall was like some other irregular geometric structure that has the same property between some pairs of locations (that is some pairs of locations in the hall are focal reflections of each other, and thus a person standing in one of the pair of locations can clearly hear another person standing in the other location). Of course, we can not allow this to happen in the contest itself, so no two teams may sit in locations that make them hear each other clearly. There is also the problem that every location in the contest hall has a specific satisfaction value assigned to it (based on how close it is to the air conditioners, lights and food).</p>

<p>Given the number of locations and the satisfaction value for each one and which locations can hear each other clearly, can you mark some of the locations such that no one will sit on them, and at least two locations are still available, and none of the available location can hear any other available location clearly, and the total sum of the satisfaction values of the available locations is maximized.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100). Followed by T test cases, each test case starts with a single line containing two integers N and M separated by a single space where N is the total number of locations (2 &le; N &le; 20) the locations are number from 1 to N, and M is the number of pairs of locations that cause the above problem (0 &le; M &le; (N &lowast; (N &minus; 1))/2). Followed by a line which contains N positive integers separated by singles spaces, the first integer is the satisfaction value for the first location, the second one is for the second location and so on, each integer will be at most 1,000. Followed by M lines, each will contain a description of a pair of locations given as two different space separated integers F and T where F and T are number of two locations which cause the above problem (1 &le; F,T &le; N).</p>

### 출력

<p>For each test case print a single line containing &ldquo;Case n:&rdquo; (without the quotes) where n is the test case number (starting from 1) followed by a space then R which is the maximum total satisfaction value which you can get after excluding some locations to satisfy the above conditions, and if you can not satisfy the above conditions R should be -1.</p>