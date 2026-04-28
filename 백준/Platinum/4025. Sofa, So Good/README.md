# [Platinum I] Sofa, So Good - 4025

[문제 링크](https://www.acmicpc.net/problem/4025)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

그래프 이론, 최대 유량, 최소 비용 최대 유량

### 문제 설명

<p>Sofia&rsquo;s Sofa Salon specializes in synthesizing and supplying spectacular specialty sofas. Their manufacturing process has been couched in mystery until recently, when it was revealed that the creation of a sofa is divided into two phases: framing and upholstering. When an order for a set of sofas comes in, the management team uses their knowledge of how quickly any particular worker can frame any given sofa to decide which worker will frame which sofa so as to minimize the total time spent framing. Management always ensures there are exactly enough workers on the job to handle the order being filled, and each worker can frame only one sofa per order (due to a recurring series of repetitive motion injury claims).</p>

<p>Once the workers have begun framing, management performs an analysis of the upholstering phase knowing the time it takes each worker to upholster any given sofa. They must assign each worker exactly one sofa to upholster (potentially different from the one they framed) when they finish their framing. A worker may have to wait until the sofa they are assigned to upholster is finished being framed by another worker, so they start work on it once it&rsquo;s available. If they are idle between the framing and upholstering phases they usually relax in the company&rsquo;s recreational facility where they play tag (this room is called the chase lounge). Management tried to stop them from playing this game, but they were stymied by a sign reading &ldquo;Do not remove this tag.&rdquo;</p>

<p>Since the workers are paid by the hour whether they are working or playing tag, management would like to assign them sofas to upholster so as to minimize the total number of hours that the workers are on-site (given the framing assignment determined earlier and the fact that each worker leaves as soon as they finish upholstering). Management is not prepared to solve such a deep-seated problem, so they have requested that you furnish a program to help them.</p>

### 입력

<p>Each test case will start with a positive integer n &le; 50 indicating both the number of sofas and the number of workers (no workers get to sit out). The following n lines each contain n positive integers; the i<sup>th</sup> value on the j<sup>th</sup> line indicates the time it takes the worker j to frame sofa i (workers and sofas are numbered starting at 1). Following this are n more lines each containing n positive integers describing the upholstering times in a similar format. All times given will be no greater than 1000. A line containing a single 0 will terminate the input.</p>

### 출력

<p>For each test case, output the case number followed by n lines, one per worker (starting with worker 1). For each worker, list the sofa they framed, the sofa they upholstered, and the time at which they finished their upholstering work, assuming all workers start framing at time 0. There will be exactly one optimal pairing of workers and couches for each phase. Following these lines, output the total idle time spent by the workers in the chase lounge during that order. Use the format shown in the example.</p>