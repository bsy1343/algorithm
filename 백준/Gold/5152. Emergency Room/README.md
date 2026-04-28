# [Gold V] Emergency Room - 5152

[문제 링크](https://www.acmicpc.net/problem/5152)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>The fact that many people in the US do not have health insurance causes many types of problems, including the following: Most doctors do not treat patients without insurance. Thus, obtaining medical care is difficult for those patients. However, hospital emergency rooms are required to treat all patients, because in their originally intended function, they may be the difference between life and death. But you see where this goes: since they are the only option that must treat uninsured patients, that&rsquo;s where uninsured patients will go, even for non-life-threatening cases such as flu or measles. Now, such cases will not be treated instantly, because after all, the emergency room does have life-and-death situations to deal with. Thus, what we have is people with flu or other infectious diseases spending many hours waiting in a crowded emergency room. To put it mildly, it&rsquo;s not clear whether that&rsquo;s the best strategy to prevent the spread of such infectious diseases. In this problem, we are going to explore the way in which diseases spread among emergency room visitors.</p>

<p>You will be given all the arrivals and departures of patients in an emergency room over time. The emergency room contains s seats, whose locations you will be given. Each arriving patient sits in the lowest-numbered seat available when he enters, and stays in that seat until he leaves. The same patient may return later, though, and will then pick a new seat. Initially, only patient 1 has the disease. A disease is transmitted from patient A to patient B if they sit at distance 2 meters or less of each other for at least 20 consecutive minutes (for instance, from time 5 until time 25; from time 5 until time 24 is not enough). If one of them leaves, then the clock starts from 0 again (i.e., it does not count to sit next to each other twice for 10 minutes each). Once a patient has the disease, he starts transmitting it the next day, i.e., 1440 minutes later; we assume that the patient stays infectious forever after that. Your goal is to figure out how many patients have the disease by the end.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line contains three integers P,S,V . 1 &le; P &le; 1000 is the number of patients (with only patient 1 sick initially), 1 &le; S &le; 100 the number of seats in the emergency room, and 1 &le; V &le; 100000 the number of visits of patients.</p>

<p>This is followed by S lines, each containing two real numbers x<sub>i</sub>,y<sub>i</sub>, the coordinates of the ith seat in meters. Next come V lines. Each of these lines contains three integers p<sub>j</sub> ,a<sub>j</sub> ,d<sub>j</sub> . p<sub>j</sub> is the number of the patient making the jth visit, a<sub>j</sub> is his arrival time (in minutes, from time 0), and d<sub>j</sub> &gt; a<sub>j</sub> his departure time. These will be sorted by non-decreasing arrival times. Our inputs will ensure that at no time will there be more than S patients in the emergency room simultaneously. Also, if a patient i arrives at the exact time another patient j leaves, we assume that j has already given up his seat, so patient i can sit there.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output, on a line by itself, the total number of patients sick by the end of the process. Each data set should be followed by an empty line.</p>