def solution(chicken):
    cnt = 0
    coupon = chicken
    
    while coupon >= 10:
        service = coupon // 10
        
        cnt += service
        coupon = coupon % 10 + service 
        
    return cnt