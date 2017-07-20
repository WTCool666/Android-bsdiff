LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE    :=server_patch
LOCAL_SRC_FILES :=\
                  bsdiff.c\
                  
#liblog.so libGLESv2.so
LOCAL_LDLIBS += -llog
include $(BUILD_SHARED_LIBRARY)